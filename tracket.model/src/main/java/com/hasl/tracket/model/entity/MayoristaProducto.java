package com.hasl.tracket.model.entity;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioProducto.
 */
@Entity
@Table(name = "MAYORISTA_PRODUCTO")
@AssociationOverrides({
		@AssociationOverride(name = "pk.mayorista", joinColumns = @JoinColumn(name = "ID_MAYORISTA")),
		@AssociationOverride(name = "pk.producto", joinColumns = @JoinColumn(name = "ID_PRODUCTO")) })
public class MayoristaProducto implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4517683896792124176L;

	/** The pk. */
	@EmbeddedId
	private MayoristaProductoID pk = new MayoristaProductoID();

	/** The precio. */
	@Basic
	@Column(name = "PRECIO")
	private Double precio;

	/** The stock. */
	@Basic
	@Column(name = "STOCK")
	private Integer stock;

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public MayoristaProductoID getPk() {
		return pk;
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
	@Transient
	public Producto getProducto() {
		return getPk().getProducto();
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
	 * Gets the mayorista.
	 *
	 * @return the mayorista
	 */
	@Transient
	public Mayorista getMayorista() {
		return getPk().getMayorista();
	}

	/**
	 * Sets the pk.
	 *
	 * @param pk
	 *            the new pk
	 */
	public void setPk(MayoristaProductoID pk) {
		this.pk = pk;
	}

	/**
	 * Sets the precio.
	 *
	 * @param precio
	 *            the new precio
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * Sets the producto.
	 *
	 * @param producto
	 *            the new producto
	 */
	public void setProducto(Producto producto) {
		getPk().setProducto(producto);
	}

	/**
	 * Sets the stock.
	 *
	 * @param stock
	 *            the new stock
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * Sets the mayorista.
	 *
	 * @param mayorista
	 *            the new mayorista
	 */
	public void setMayorista(Mayorista mayorista) {
		getPk().setMayorista(mayorista);
	}

}
