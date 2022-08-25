package com.hackaton.dinothon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hackaton.dinothon.entity.Orden;



@Mapper
public interface DespachoMapper {
	
	
	@ResultMap("ocMap")
	@Select.List(value = { @Select("select ho.id_desp ,\n"
			+ "ho.n_orden , \n"
			+ "hd.n_f12, \n"
			+ "hd.n_estado, \n"
			+ "hc.a_nombre, \n"
			+ "hc.a_celular, \n"
			+ "hdi.a_calle, \n"
			+ "hdi.a_numero,\n"
			+ "hdi.a_comuna, \n"
			+ "hp.n_sku, \n"
			+ "hp.a_nombre_producto, \n"
			+ "hp.a_tamano, \n"
			+ "hp.n_cantidad\n"
			+ "from hck_despacho hd \n"
			+ "inner join hck_orden ho \n"
			+ "on hd.n_orden = ho.n_orden \n"
			+ "inner join hck_cliente hc \n"
			+ "on hc.id_cliente = ho.id_cliente \n"
			+ "inner join hck_direccion hdi\n"
			+ "on hdi.id_cliente = hc.id_cliente \n"
			+ "inner join hck_producto hp \n"
			+ "on hd.id_despacho = hp.id_despacho \n"
			+ "where hd.n_f12 =  #{f12}") })
	public List<Orden> getDespachoByF12 (String f12);
	
	@Update("update hck_despacho set n_estado = 1 where n_f12 = #{f12}")
	public void actualizaDespachoByF12(String f12);

}
