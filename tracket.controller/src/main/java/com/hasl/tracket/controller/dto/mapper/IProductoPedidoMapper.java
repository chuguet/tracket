package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.MayoristaProductoDTO;
import com.hasl.tracket.controller.dto.ProductoPedidoDTO;
import com.hasl.tracket.model.entity.MayoristaProducto;
import com.hasl.tracket.model.entity.ProductoPedido;

// TODO: Auto-generated Javadoc
/**
 * The Interface IProductoPedidoMapper.
 */
public interface IProductoPedidoMapper extends IMapper {

	/**
	 * From producto pedido dto list to producto pedido list.
	 *
	 * @param listProductoPedidoDTO the list producto pedido dto
	 * @return the list
	 */
	List<ProductoPedido> fromProductoPedidoDTOListToProductoPedidoList(List<ProductoPedidoDTO> listProductoPedidoDTO);

	/**
	 * From producto pedido dto to producto pedido.
	 *
	 * @param productoPedidoDTO
	 *            the producto pedido dto
	 * @return the producto pedido
	 */
	ProductoPedido fromProductoPedidoDTOToProductoPedido(
			ProductoPedidoDTO productoPedidoDTO);
	
	/**
	 * From producto pedido list to producto pedido dto list.
	 *
	 * @param listProductoPedido the list producto pedido
	 * @return the list
	 */
	List<ProductoPedidoDTO> fromProductoPedidoListToProductoPedidoDTOList(List<ProductoPedido> listProductoPedido);
	
	
	/**
	 * From producto pedido to producto pedido dto.
	 *
	 * @param productoPedido
	 *            the producto pedido
	 * @return the producto pedido dto
	 */
	ProductoPedidoDTO fromProductoPedidoToProductoPedidoDTO(
			ProductoPedido productoPedido);
}

