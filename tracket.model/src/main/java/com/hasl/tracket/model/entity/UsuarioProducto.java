package com.hasl.tracket.model.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioProducto.
 */
@Entity
@Table(name = "USUARIO_PRODUCTO")
public class UsuarioProducto implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4517683896792124176L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO_PRODUCTO")
	private Integer id;

	/** The precio. */
	@Basic
	@Column(name = "PRECIO")
	private Double precio;

	/** The producto. */
	@ManyToOne
	@JoinColumn(name = "ID_PRODUCTO")
	private Producto producto;

	/** The stock. */
	@Basic
	@Column(name = "STOCK")
	private Integer stock;

	/** The usuario. */
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
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
	 * Gets the stock.
	 *
	 * @return the stock
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * Sets the producto.
	 *
	 * @param producto the new producto
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * Sets the stock.
	 *
	 * @param stock the new stock
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the new usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
