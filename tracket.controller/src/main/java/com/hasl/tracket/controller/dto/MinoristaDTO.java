package com.hasl.tracket.controller.dto;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class MinoristaDTO.
 */
public class MinoristaDTO extends UsuarioDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4095878734442716309L;

	/** The pedidos. */
	private List<PedidoDTO> pedidos;

	/**
	 * Gets the pedidos.
	 *
	 * @return the pedidos
	 */
	public List<PedidoDTO> getPedidos() {
		return pedidos;
	}

	/**
	 * Sets the pedidos.
	 *
	 * @param pedidos the new pedidos
	 */
	public void setPedidos(List<PedidoDTO> pedidos) {
		this.pedidos = pedidos;
	}

}
