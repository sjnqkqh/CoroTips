package com.coronaOff.Controller;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class UtilClass {

	private static final Logger log = LoggerFactory.getLogger(MainController.class);

	public String passwordEncrypt(String oriPw) {
		String encPw = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(oriPw.getBytes());
			encPw = byteToHexString(md.digest());
		} catch (Exception e) {
			log.info("message:", e);
		}

		return encPw;
	}

	public String byteToHexString(byte[] data) {
		StringBuilder sb = new StringBuilder();
		for (byte b : data) {
			sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

	public String sessionCheck(HttpSession session, HttpServletRequest request) {
		String direct = "loginPage";
		int result = -1;

		if (session.getAttribute("id") != null) {
			result = 1;
		} else if (session.getAttribute("id") != null && session.getAttribute("id").equals("boss")) {
			result = 2;
		}
		if (result > 0) {
			direct = request.getRequestURI().toString().replace("/", "");
		}

		return direct;
	}

	public void logManager(HttpServletRequest request) {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		log.info("time : " + format1.format(System.currentTimeMillis()));
		Enumeration<String> paramKeys = request.getParameterNames();
		while (paramKeys.hasMoreElements()) {
			String key = paramKeys.nextElement();
			log.info(key + ":" + request.getParameter(key));
		}
		log.info("protocol : " + request.getRequestURI().toString().replace("/", ""));

	}

}
