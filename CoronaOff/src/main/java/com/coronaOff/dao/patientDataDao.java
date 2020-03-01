package com.coronaOff.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.patientData;
@Mapper
public interface patientDataDao {
	public ArrayList<patientData> selectAllPatientData();
	public patientData selectPatientDataBySeq(int pseq);

}
