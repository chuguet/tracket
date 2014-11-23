package com.hasl.tracket.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoPedidoID.
 */
@Embeddable
public class ProductoPedidoID implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6551990279015701425L;

	/** The pedido. */
	@ManyToOne
	private Pedido pedido;

	/** The producto. */
	@ManyToOne
	private Producto producto;

	/**
	 * Gets the pedido.
	 *
	 * @return the pedido
	 */
	public Pedido getPedido() {
		return pedido;
	}

	/**
	 * Gets the producto.
	 *
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * Sets the pedido.
	 *
	 * @param pedido the new pedido
	 */
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	/**
	 * Sets the producto.
	 *
	 * @param producto the new producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
