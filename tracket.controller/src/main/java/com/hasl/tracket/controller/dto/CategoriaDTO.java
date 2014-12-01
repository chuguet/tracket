package com.hasl.tracket.controller.dto;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriaDTO.
 */
public class CategoriaDTO extends AbstractDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7998141866094132936L;

	/** The nombre. */
	private String nombre;

	/** The productos. */
	private List<ProductoDTO> productos;

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Gets the productos.
	 *
	 * @return the productos
	 */
	public List<ProductoDTO> getProductos() {
		return productos;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Sets the productos.
	 *
	 * @param productos the new productos
	 */
	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}

}
