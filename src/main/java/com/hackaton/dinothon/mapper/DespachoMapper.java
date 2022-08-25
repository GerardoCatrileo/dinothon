package com.hackaton.dinothon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import com.hackaton.dinothon.entity.Despacho;



@Mapper
public interface DespachoMapper {
	

	@Transactional(readOnly = true)
	public List<Despacho> getDespachoByF12 (String f12);
	

}
