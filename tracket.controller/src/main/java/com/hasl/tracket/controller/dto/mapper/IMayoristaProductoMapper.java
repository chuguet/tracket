package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.MayoristaProductoDTO;
import com.hasl.tracket.model.entity.MayoristaProducto;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMayoristaProductoMapper.
 */
public interface IMayoristaProductoMapper extends IMapper {

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
	 * From mayorista producto to mayorista producto dto.
	 *
	 * @param mayoristaProducto
	 *            the mayorista producto
	 * @return the mayorista producto dto
	 */
	MayoristaProductoDTO fromMayoristaProductoToMayoristaProductoDTO(
			MayoristaProducto mayoristaProducto);
}
