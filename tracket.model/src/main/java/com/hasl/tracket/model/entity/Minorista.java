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
 * The Class Minorista.
 */
@Entity
@Table(name = "MINORISTA")
@PrimaryKeyJoinColumn(name = "ID_MINORISTA", referencedColumnName="ID_USUARIO")
public class Minorista extends Usuario {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6599311656878558428L;

	/** The pedidos. */
	@OneToMany(mappedBy = "minorista")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Pedido> pedidos;

	/**
	 * Gets the pedidos.
	 *
	 * @return the pedidos
	 */
	public List<Pedido> getPedidos() {
		return pedidos;
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
