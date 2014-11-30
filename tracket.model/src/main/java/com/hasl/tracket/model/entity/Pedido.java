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

	/** The fecha alta. */
	@Basic
	@Column(name = "FECHA_ALTA")
	private Date fechaAlta;
	

	/** The fecha cancelacion. */
	@Basic
	@Column(name = "FECHA_CANCELACION")
	private Date fechaCancelacion;
	

	/** The fecha modificacion. */
	@Basic
	@Column(name = "FECHA_MODIFICACION")
	private Date fechaModificacion;

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
	 * Gets the fecha alta.
	 *
	 * @return the fecha alta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Gets the fecha cancelacion.
	 *
	 * @return the fecha cancelacion
	 */
	public Date getFechaCancelacion() {
		return fechaCancelacion;
	}


	/**
	 * Gets the fecha modificacion.
	 *
	 * @return the fecha modificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
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
	 * Gets the mayorista.
	 *
	 * @return the mayorista
	 */
	public Mayorista getMayorista() {
		return mayorista;
	}

	/**
	 * Gets the minorista.
	 *
	 * @return the minorista
	 */
	public Minorista getMinorista() {
		return minorista;
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
	 * Sets the fecha alta.
	 *
	 * @param fechaAlta the new fecha alta
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * Sets the fecha cancelacion.
	 *
	 * @param fechaCancelacion the new fecha cancelacion
	 */
	public void setFechaCancelacion(Date fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	/**
	 * Sets the fecha modificacion.
	 *
	 * @param fechaModificacion the new fecha modificacion
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
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
	 * Sets the mayorista.
	 *
	 * @param mayorista the new mayorista
	 */
	public void setMayorista(Mayorista mayorista) {
		this.mayorista = mayorista;
	}

	/**
	 * Sets the minorista.
	 *
	 * @param minorista the new minorista
	 */
	public void setMinorista(Minorista minorista) {
		this.minorista = minorista;
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
