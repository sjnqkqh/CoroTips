package com.coronaOff.Controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coronaOff.dao.hospitalDao;
import com.coronaOff.dto.hospital;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class hospitalController {

	@Autowired
	hospitalDao hospDao;
	UtilClass ut = new UtilClass();
	@RequestMapping("hospitalListPage")
	public ModelAndView hospitalList(@RequestParam(defaultValue = "1")int page,HttpServletRequest request) {
		ut.logManager(request);
		
		ArrayList<hospital> hospitalList = hospDao.selectAllHospital();
		
		ModelAndView mav = new ModelAndView("hospitalListPage");
		mav.addObject("hospitalList", hospitalList);
		
		return mav;
	}

}
