package com.hackaton.dinothon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface TransporteMapper {
	
	
	@Select("select count(*) from hck_transporte ht \n"
			+ "where upper(a_patente) = upper(#{patente});")
	public Integer buscaRuta (String patente);
	

}
