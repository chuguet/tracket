package com.hasl.tracket.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

// TODO: Auto-generated Javadoc
/**
 * The Class Mayorista.
 */
@Entity
@Table(name = "MAYORISTA")
@PrimaryKeyJoinColumn(name = "ID_MAYORISTA", referencedColumnName="ID_USUARIO")
public class Mayorista extends Usuario {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 60448791629203183L;

	/** The mayorista productos. */
	@OneToMany(mappedBy = "pk.mayorista")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<MayoristaProducto> mayoristaProductos;

	/** The pedidos. */
	@OneToMany(mappedBy = "mayorista")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Pedido> pedidos;

	/**
	 * Gets the mayorista productos.
	 *
	 * @return the mayorista productos
	 */
	public List<MayoristaProducto> getMayoristaProductos() {
		return mayoristaProductos;
	}

	/**
	 * Gets the pedidos.
	 *
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
	}

	/**
	 * Sets the mayorista productos.
	 *
	 * @param mayoristaProductos
	 *            the new mayorista productos
	 */
	public void setMayoristaProductos(List<MayoristaProducto> mayoristaProductos) {
		this.mayoristaProductos = mayoristaProductos;
	}

	/**
	 * Sets the pedidos.
	 *
	 * @param pedidos
	 *            the new pedidos
	 */
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
