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
 * The Class ProductoPedido.
 */
@Entity
@Table(name = "PRODUCTO_PEDIDO")
@AssociationOverrides({
		@AssociationOverride(name = "pk.pedido", joinColumns = @JoinColumn(name = "ID_PEDIDO")),
		@AssociationOverride(name = "pk.producto", joinColumns = @JoinColumn(name = "ID_PRODUCTO")) })
public class ProductoPedido implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2627856649699874432L;

	/** The cantidad. */
	@Basic
	@Column(name = "CANTIDAD")
	private Integer cantidad;

	/** The pk. */
	@EmbeddedId
	private ProductoPedidoID pk = new ProductoPedidoID();

	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * Gets the pedido.
	 *
	 * @return the pedido
	 */
	@Transient
	public Pedido getPedido() {
		return getPk().getPedido();
	}

	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public ProductoPedidoID getPk() {
		return pk;
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
	 * Sets the cantidad.
	 *
	 * @param cantidad
	 *            the new cantidad
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Sets the pedido.
	 *
	 * @param pedido
	 *            the new pedido
	 */
	public void setPedido(Pedido pedido) {
		getPk().setPedido(pedido);
	}

	/**
	 * Sets the pk.
	 *
	 * @param pk
	 *            the new pk
	 */
	public void setPk(ProductoPedidoID pk) {
		this.pk = pk;
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

}
