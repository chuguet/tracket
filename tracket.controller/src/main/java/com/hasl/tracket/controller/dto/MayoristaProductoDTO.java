package com.hasl.tracket.controller.dto;


// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaProductoDTO.
 */
public class MayoristaProductoDTO extends AbstractDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7364964520923451508L;

	/** The precio. */
	private Double precio;

	/** The stock. */
	private Integer stock;

	/**
	 * Gets the precio.
	 *
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
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
	 * Sets the precio.
	 *
	 * @param precio the new precio
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * Sets the stock.
	 *
	 * @param stock the new stock
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
