package com.hasl.tracket.controller.dto.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.MayoristaProductoDTO;
import com.hasl.tracket.controller.dto.mapper.IMayoristaProductoMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.MayoristaProducto;

@Component
public class MayoristaProductoMapperIml extends AbstractMapper implements
		IMayoristaProductoMapper {

	@Override
	public MapperType getMapperType() {
		return MapperType.MAYORISTA_PRODUCTO_MAPPER;
	}

	@Override
	public List<MayoristaProducto> fromMayoristaProductoDTOListToMayoristaProductoList(
			List<MayoristaProductoDTO> listMayoristaProductosDTO) {
		 List<MayoristaProducto> listMayoristaProductos= new ArrayList<MayoristaProducto>();
		return listMayoristaProductos;
	}

	@Override
	public MayoristaProducto fromMayoristaProductoDTOToMayoristaProducto(
			MayoristaProductoDTO mayoristaProductoDTO) {
		MayoristaProducto mayoristaProducto= new MayoristaProducto();
		return mayoristaProducto;
	}

	@Override
	public List<MayoristaProductoDTO> fromMayoristaProductoListToMayoristaProductoDTOList(
			List<MayoristaProducto> listMayoristaProductos) {
		List<MayoristaProductoDTO> listMayoristaProductoDTO= new ArrayList<MayoristaProductoDTO>();
		return listMayoristaProductoDTO;
	}

	@Override
	public MayoristaProductoDTO fromMayoristaProductoToMayoristaProductoDTO(
			MayoristaProducto mayoristaProducto) {
		MayoristaProductoDTO mayoristaProductoDTO= new MayoristaProductoDTO();
		return mayoristaProductoDTO;
	}

}
