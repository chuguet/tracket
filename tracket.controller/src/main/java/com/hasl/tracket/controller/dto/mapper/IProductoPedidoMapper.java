package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.ProductoPedidoDTO;
import com.hasl.tracket.model.entity.ProductoPedido;

// TODO: Auto-generated Javadoc
/**
 * The Interface IProductoPedidoMapper.
 */
public interface IProductoPedidoMapper extends IMapper {

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
	 * From producto pedido to producto pedido dto.
	 *
	 * @param productoPedido
	 *            the producto pedido
	 * @return the producto pedido dto
	 */
	ProductoPedidoDTO fromProductoPedidoToProductoPedidoDTO(
			ProductoPedido productoPedido);
}
