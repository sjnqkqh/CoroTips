package com.coronaOff.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coronaOff.dao.localDao;
import com.coronaOff.dao.maskSellerDao;
import com.coronaOff.dao.patientNumberDao;
import com.coronaOff.dto.local;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

	UtilClass ut = new UtilClass();
	@Autowired
	localDao localDao;
	@Autowired
	maskSellerDao sellerDao;
	@Autowired
	patientNumberDao pnDao;
	
	@RequestMapping("healthInfoPage")
	public void healthInfoPage(HttpServletRequest request) {
		ut.logManager(request);
	}

	@RequestMapping("coronaAnalysisPage")
	public ModelAndView coronaAnalysisPage(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("coronaAnalysisPage");
		mav.addObject("maskSellerList", sellerDao.selectAllmaskSellerList());
		mav.addObject("localStatus", localDao.selectAllLocalInfo());
		mav.addObject("patientNumber", pnDao.getPatientNumber());

		return mav;
	}
	
	
}
