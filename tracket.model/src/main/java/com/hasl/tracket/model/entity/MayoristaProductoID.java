package com.hasl.tracket.model.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioPedidoID.
 */
@Embeddable
public class MayoristaProductoID implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3515581513651177803L;

	/** The producto. */
	@ManyToOne
	@JoinColumn(name = "ID_PRODUCTO")
	private Producto producto;

	/** The mayorista. */
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Mayorista mayorista;

	/**
	 * Gets the producto.
	 *
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * Gets the mayorista.
	 *
	 * @return the mayorista
	 */
	public Mayorista getMayorista() {
		return mayorista;
	}

	/**
	 * Sets the producto.
	 *
	 * @param producto
	 *            the new producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * Sets the mayorista.
	 *
	 * @param mayorista
	 *            the new mayorista
	 */
	public void setMayorista(Mayorista mayorista) {
		this.mayorista = mayorista;
	}
}
