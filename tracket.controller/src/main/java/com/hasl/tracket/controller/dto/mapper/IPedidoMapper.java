package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.PedidoDTO;
import com.hasl.tracket.model.entity.Pedido;

// TODO: Auto-generated Javadoc
/**
 * The Interface IPedidoMapper.
 */
public interface IPedidoMapper extends IMapper {

	/**
	 * From pedido dto to pedido.
	 *
	 * @param pedidoDTO
	 *            the pedido dto
	 * @return the pedido
	 */
	Pedido fromPedidoDTOToPedido(PedidoDTO pedidoDTO);

	/**
	 * From pedido to pedido dto.
	 *
	 * @param pedido
	 *            the pedido
	 * @return the pedido dto
	 */
	PedidoDTO fromPedidoToPedidoDTO(Pedido pedido);
}
