package com.coronaOff.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.coronaOff.dto.youtube;
@Mapper
public interface youtubeDao {

	public ArrayList<youtube> selectAllYoutube();
	public youtube selectYoutubeBySeq(int yseq);
	
	
}
