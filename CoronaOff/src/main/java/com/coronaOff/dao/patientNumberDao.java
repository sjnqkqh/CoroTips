package com.coronaOff.dao;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.patientNumber;
@Mapper
public interface patientNumberDao {

	public patientNumber getPatientNumber();
	
}
