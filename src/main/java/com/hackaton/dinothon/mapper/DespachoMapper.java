package com.hackaton.dinothon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.hackaton.dinothon.entity.Despacho;



@Mapper
public interface DespachoMapper {
	
	
	@ResultMap("despachoMap")
	@Select.List(value = { @Select("select id_despacho, n_f12 from hck_despacho hd where n_f12 = #{f12}") })
	public List<Despacho> getDespachoByF12 (String f12);

}
