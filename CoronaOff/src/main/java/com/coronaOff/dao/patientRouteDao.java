package com.coronaOff.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.patienRoute;
@Mapper
public interface patientRouteDao {
	public ArrayList<patienRoute> selectRouteByPnum(int pnum);

}
