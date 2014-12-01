package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.ProductoDTO;
import com.hasl.tracket.model.entity.Producto;

// TODO: Auto-generated Javadoc
/**
 * The Interface IProductoMapper.
 */
public interface IProductoMapper extends IMapper {

	/**
	 * From producto dto to producto.
	 *
	 * @param productoDTO
	 *            the producto dto
	 * @return the producto
	 */
	Producto fromProductoDTOToProducto(ProductoDTO productoDTO);

	/**
	 * From producto to producto dto.
	 *
	 * @param producto
	 *            the producto
	 * @return the producto dto
	 */
	ProductoDTO fromProductoToProductoDTO(Producto producto);
}
