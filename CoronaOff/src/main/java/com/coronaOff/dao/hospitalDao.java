package com.coronaOff.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.hospital;
import com.coronaOff.dto.youtube;
@Mapper
public interface hospitalDao {

	public ArrayList<hospital> selectAllHospital();
	public ArrayList<hospital> hospitalListPage(HashMap<String, Integer> page);
	public int getNumberOfHospital();
	
	
	
}
