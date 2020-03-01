package com.coronaOff.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coronaOff.dao.patientDataDao;
import com.coronaOff.dao.youtubeDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PatientController {

	@Autowired
	patientDataDao pDao;
	UtilClass ut = new UtilClass();
	@RequestMapping("patientListPage")
	public ModelAndView patientListPage(HttpServletRequest request) {
		ut.logManager(request);
		
		ModelAndView mav = new ModelAndView("patientListPage");
		mav.addObject("patientList", pDao.selectAllPatientData());
		return mav;
	}
	
}
