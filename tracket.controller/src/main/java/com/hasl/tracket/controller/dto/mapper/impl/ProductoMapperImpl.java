package com.hasl.tracket.controller.dto.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.ProductoDTO;
import com.hasl.tracket.controller.dto.mapper.ICategoriaMapper;
import com.hasl.tracket.controller.dto.mapper.IMayoristaProductoMapper;
import com.hasl.tracket.controller.dto.mapper.IProductoMapper;
import com.hasl.tracket.controller.dto.mapper.IProductoPedidoMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Producto;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoMapperImpl.
 */
@Component
public class ProductoMapperImpl extends AbstractMapper implements
		IProductoMapper {

	/* (non-Javadoc)
	 * @see com.hasl.tracket.controller.dto.mapper.IProductoMapper#fromProductoDTOListToProductoList(java.util.List)
	 */
	@Override
	public List<Producto> fromProductoDTOListToProductoList(
			List<ProductoDTO> listProductoDTO) {
		List<Producto> listProductos = new ArrayList<Producto>();
		for (ProductoDTO productoDTO : listProductoDTO) {
			Producto producto = fromProductoDTOToProducto(productoDTO);
			listProductos.add(producto);
		}
		return listProductos;
	}

	/* (non-Javadoc)
	 * @see com.hasl.tracket.controller.dto.mapper.IProductoMapper#fromProductoDTOToProducto(com.hasl.tracket.controller.dto.ProductoDTO)
	 */
	@Override
	public Producto fromProductoDTOToProducto(ProductoDTO productoDTO) {
		Producto producto = new Producto();
		ICategoriaMapper categoriaMapper = (ICategoriaMapper) getMapperFactory()
				.getMapper(MapperType.CATEGORIA_MAPPER);
		producto.setCategoria(categoriaMapper
				.fromCategoriaDTOToCategoria(productoDTO.getCategoria()));
		producto.setNombre(productoDTO.getNombre());
		producto.setTamano(productoDTO.getTamano());
//		IMayoristaProductoMapper mayoristaProductoMapper = (IMayoristaProductoMapper) getMapperFactory()
//				.getMapper(MapperType.MAYORISTA_PRODUCTO_MAPPER);
//		producto.setMayoristaProductos(mayoristaProductoMapper
//				.fromMayoristaProductoDTOListToMayoristaProductoList(productoDTO
//						.getMayoristaProductos()));
//		IProductoPedidoMapper productoPedidoMapper = (IProductoPedidoMapper) getMapperFactory()
//				.getMapper(MapperType.PRODUCTO_PEDIDO_MAPPER);
//		producto.setProductoPedidos(productoPedidoMapper
//				.fromProductoPedidoDTOListToProductoPedidoList(productoDTO
//						.getProductoPedidos()));
		return producto;
	}

	/* (non-Javadoc)
	 * @see com.hasl.tracket.controller.dto.mapper.IProductoMapper#fromProductoListToProductoDTOList(java.util.List)
	 */
	@Override
	public List<ProductoDTO> fromProductoListToProductoDTOList(
			List<Producto> listProducto) {
		List<ProductoDTO> listProductoDTO = new ArrayList<ProductoDTO>();
		for (Producto producto : listProducto) {
			ProductoDTO productoDTO = fromProductoToProductoDTO(producto);
			listProductoDTO.add(productoDTO);

		}
		return listProductoDTO;
	}

	/* (non-Javadoc)
	 * @see com.hasl.tracket.controller.dto.mapper.IProductoMapper#fromProductoToProductoDTO(com.hasl.tracket.model.entity.Producto)
	 */
	@Override
	public ProductoDTO fromProductoToProductoDTO(Producto producto) {
		ProductoDTO productoDTO = new ProductoDTO();
		ICategoriaMapper categoriaMapper = (ICategoriaMapper) getMapperFactory()
				.getMapper(MapperType.CATEGORIA_MAPPER);
		productoDTO.setCategoria(categoriaMapper
				.fromCategoriaToCategoriaDTO(producto.getCategoria()));
		productoDTO.setNombre(producto.getNombre());
		productoDTO.setTamano(producto.getTamano());
		IMayoristaProductoMapper mayoristaProductoMapper = (IMayoristaProductoMapper) getMapperFactory()
				.getMapper(MapperType.MAYORISTA_PRODUCTO_MAPPER);
		productoDTO.setMayoristaProductos(mayoristaProductoMapper
				.fromMayoristaProductoListToMayoristaProductoDTOList(producto
						.getMayoristaProductos()));
		IProductoPedidoMapper productoPedidoMapper = (IProductoPedidoMapper) getMapperFactory()
				.getMapper(MapperType.PRODUCTO_PEDIDO_MAPPER);
		productoDTO.setProductoPedidos(productoPedidoMapper
				.fromProductoPedidoListToProductoPedidoDTOList(producto
						.getProductoPedidos()));
		return productoDTO;
	}

	/* (non-Javadoc)
	 * @see com.hasl.tracket.controller.dto.mapper.IMapper#getMapperType()
	 */
	@Override
	public MapperType getMapperType() {
		return MapperType.PRODUCTO_MAPPER;
	}

}
