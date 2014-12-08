package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.MayoristaProductoDTO;
import com.hasl.tracket.model.entity.MayoristaProducto;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMayoristaProductoMapper.
 */
public interface IMayoristaProductoMapper extends IMapper {

	/**
	 * From mayorista producto dto list to mayorista producto list.
	 *
	 * @param listMayoristaProductosDTO the list mayorista productos dto
	 * @return the list
	 */
	List<MayoristaProducto> fromMayoristaProductoDTOListToMayoristaProductoList(List<MayoristaProductoDTO> listMayoristaProductosDTO);

	/**
	 * From mayorista producto dto to mayorista producto.
	 *
	 * @param mayoristaProductoDTO
	 *            the mayorista producto dto
	 * @return the mayorista producto
	 */
	MayoristaProducto fromMayoristaProductoDTOToMayoristaProducto(
			MayoristaProductoDTO mayoristaProductoDTO);
	
	/**
	 * From mayorista producto list to mayorista producto dto list.
	 *
	 * @param listMayoristaProductos the list mayorista productos
	 * @return the list
	 */
	List<MayoristaProductoDTO> fromMayoristaProductoListToMayoristaProductoDTOList(List<MayoristaProducto> listMayoristaProductos);
	
	/**
	 * From mayorista producto to mayorista producto dto.
	 *
	 * @param mayoristaProducto
	 *            the mayorista producto
	 * @return the mayorista producto dto
	 */
	MayoristaProductoDTO fromMayoristaProductoToMayoristaProductoDTO(
			MayoristaProducto mayoristaProducto);
}
