package com.coronaOff.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.local;
import com.coronaOff.dto.maskSeller;
@Mapper
public interface maskSellerDao {

	public List<maskSeller> selectAllmaskSellerList();
	
}
