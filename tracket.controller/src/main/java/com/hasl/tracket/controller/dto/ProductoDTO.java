package com.hasl.tracket.controller.dto;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoDTO.
 */
public class ProductoDTO extends AbstractDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5799245716778905990L;

	/** The categoria. */
	private CategoriaDTO categoria;

	/** The mayorista productos. */
	private List<MayoristaProductoDTO> mayoristaProductos;

	/** The nombre. */
	private String nombre;

	/** The producto pedidos. */
	private List<ProductoPedidoDTO> productoPedidos;

	/** The tamano. */
	private String tamano;

	/**
	 * Gets the categoria.
	 *
	 * @return the categoria
	 */
	public CategoriaDTO getCategoria() {
		return categoria;
	}

	/**
	 * Gets the mayorista productos.
	 *
	 * @return the mayorista productos
	 */
	public List<MayoristaProductoDTO> getMayoristaProductos() {
		return mayoristaProductos;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Gets the producto pedidos.
	 *
	 * @return the producto pedidos
	 */
	public List<ProductoPedidoDTO> getProductoPedidos() {
		return productoPedidos;
	}

	/**
	 * Gets the tamano.
	 *
	 * @return the tamano
	 */
	public String getTamano() {
		return tamano;
	}

	/**
	 * Sets the categoria.
	 *
	 * @param categoria
	 *            the new categoria
	 */
	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
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
	 * Sets the nombre.
	 *
	 * @param nombre
	 *            the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * Sets the producto pedidos.
	 *
	 * @param productoPedidos the new producto pedidos
	 */
	public void setProductoPedidos(List<ProductoPedidoDTO> productoPedidos) {
		this.productoPedidos = productoPedidos;
	}


	/**
	 * Sets the tamano.
	 *
	 * @param tamano the new tamano
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	
	
}
