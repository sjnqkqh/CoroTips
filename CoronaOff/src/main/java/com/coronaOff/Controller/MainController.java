package com.coronaOff.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coronaOff.dao.localDao;
import com.coronaOff.dao.patientNumberDao;
import com.coronaOff.dto.patientNumber;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MainController {

	UtilClass ut = new UtilClass();
	@Autowired
	localDao localDao;

	@Autowired
	patientNumberDao pnDao;
		
	@RequestMapping("healthInfoPage")
	public void healthInfoPage(HttpServletRequest request) {
		ut.logManager(request);
	}

	@RequestMapping("coronaAnalysisPage")
	public ModelAndView coronaAnalysisPage(HttpServletRequest request) throws IOException {
		ModelAndView mav = new ModelAndView("coronaAnalysisPage");
			
		patientNumber pn = pnDao.getPatientNumber();	
		
		int curedPercent = (int) (((double)pn.getCuredPatient() / (double)pn.getTotalPatient())*100);
		mav.addObject("localStatus", localDao.selectAllLocalInfo());
		mav.addObject("patientNumber", pn);
		mav.addObject("curedPercent",curedPercent);
		return mav;
	}
	
	
	
}
