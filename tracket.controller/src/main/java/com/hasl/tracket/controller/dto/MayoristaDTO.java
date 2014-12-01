package com.hasl.tracket.controller.dto;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaDTO.
 */
public class MayoristaDTO extends UsuarioDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4107887769287862871L;

	/** The mayorista productos. */
	private List<MayoristaProductoDTO> mayoristaProductos;

	/** The pedidos. */
	private List<PedidoDTO> pedidos;

	/**
	 * Gets the mayorista productos.
	 *
	 * @return the mayorista productos
	 */
	public List<MayoristaProductoDTO> getMayoristaProductos() {
		return mayoristaProductos;
	}

	/**
	 * Gets the pedidos.
	 *
	 * @return the pedidos
	 */
	public List<PedidoDTO> getPedidos() {
		return pedidos;
	}

	/**
	 * Sets the mayorista productos.
	 *
	 * @param mayoristaProductos
	 *            the new mayorista productos
	 */
	public void setMayoristaProductos(
			List<MayoristaProductoDTO> mayoristaProductos) {
		this.mayoristaProductos = mayoristaProductos;
	}

	/**
	 * Sets the pedidos.
	 *
	 * @param pedidos
	 *            the new pedidos
	 */
	public void setPedidos(List<PedidoDTO> pedidos) {
		this.pedidos = pedidos;
	}
}
