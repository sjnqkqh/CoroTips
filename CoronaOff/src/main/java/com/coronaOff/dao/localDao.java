package com.coronaOff.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.local;
@Mapper
public interface localDao {

	public List<local> selectAllLocalInfo();
	
}
