package com.hasl.tracket.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

// TODO: Auto-generated Javadoc
/**
 * The Class Pedido.
 */
@Entity
@Table(name = "PEDIDO")
public class Pedido implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6699108103426129969L;

	/** The fecha. */
	@Basic
	@Column(name = "FECHA")
	private Date fecha;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PEDIDO")
	private Integer id;

	/** The mayorista. */
	@ManyToOne
	@JoinColumn(name = "ID_MAYORISTA")
	private Mayorista mayorista;

	/** The minorista. */
	@ManyToOne
	@JoinColumn(name = "ID_MINORISTA")
	private Minorista minorista;

	/** The producto pedidos. */
	@OneToMany(mappedBy = "pk.pedido")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ProductoPedido> productoPedidos;

	/**
	 * Gets the fecha.
	 *
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the producto pedidos.
	 *
	 * @return the producto pedidos
	 */
	public List<ProductoPedido> getProductoPedidos() {
		return productoPedidos;
	}

	/**
	 * Sets the fecha.
	 *
	 * @param fecha
	 *            the new fecha
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the producto pedidos.
	 *
	 * @param productoPedidos
	 *            the new producto pedidos
	 */
	public void setProductoPedidos(List<ProductoPedido> productoPedidos) {
		this.productoPedidos = productoPedidos;
	}
}
