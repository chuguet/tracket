package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.ProductoDTO;
import com.hasl.tracket.model.entity.Producto;

// TODO: Auto-generated Javadoc
/**
 * The Interface IProductoMapper.
 */
public interface IProductoMapper extends IMapper {

	/**
	 * From producto dto list to producto list.
	 *
	 * @param listProductoDTO the list producto dto
	 * @return the list
	 */
	List<Producto> fromProductoDTOListToProductoList(List<ProductoDTO> listProductoDTO);

	/**
	 * From producto dto to producto.
	 *
	 * @param productoDTO
	 *            the producto dto
	 * @return the producto
	 */
	Producto fromProductoDTOToProducto(ProductoDTO productoDTO);
	
	/**
	 * From producto list to producto dto list.
	 *
	 * @param listProducto the list producto
	 * @return the list
	 */
	List<ProductoDTO> fromProductoListToProductoDTOList(List<Producto> listProducto);
	
	/**
	 * From producto to producto dto.
	 *
	 * @param producto
	 *            the producto
	 * @return the producto dto
	 */
	ProductoDTO fromProductoToProductoDTO(Producto producto);
}
