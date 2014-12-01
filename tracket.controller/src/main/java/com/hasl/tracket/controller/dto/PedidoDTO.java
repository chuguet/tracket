package com.hasl.tracket.controller.dto;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class PedidoDTO.
 */
public class PedidoDTO extends AbstractDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6158343135645214796L;

	/** The fecha alta. */
	private String fechaAlta;

	/** The fecha cancelacion. */
	private String fechaCancelacion;

	/** The fecha modificacion. */
	private String fechaModificacion;

	/** The mayorista. */
	private MayoristaDTO mayorista;

	/** The minorista. */
	private MinoristaDTO minorista;

	/** The producto pedidos. */
	private List<ProductoPedidoDTO> productoPedidos;

	/**
	 * Gets the fecha alta.
	 *
	 * @return the fecha alta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * Gets the fecha cancelacion.
	 *
	 * @return the fecha cancelacion
	 */
	public String getFechaCancelacion() {
		return fechaCancelacion;
	}

	/**
	 * Gets the fecha modificacion.
	 *
	 * @return the fecha modificacion
	 */
	public String getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * Gets the mayorista.
	 *
	 * @return the mayorista
	 */
	public MayoristaDTO getMayorista() {
		return mayorista;
	}

	/**
	 * Gets the minorista.
	 *
	 * @return the minorista
	 */
	public MinoristaDTO getMinorista() {
		return minorista;
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
	 * Sets the fecha alta.
	 *
	 * @param fechaAlta
	 *            the new fecha alta
	 */
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	/**
	 * Sets the fecha cancelacion.
	 *
	 * @param fechaCancelacion
	 *            the new fecha cancelacion
	 */
	public void setFechaCancelacion(String fechaCancelacion) {
		this.fechaCancelacion = fechaCancelacion;
	}

	/**
	 * Sets the fecha modificacion.
	 *
	 * @param fechaModificacion
	 *            the new fecha modificacion
	 */
	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Sets the mayorista.
	 *
	 * @param mayorista
	 *            the new mayorista
	 */
	public void setMayorista(MayoristaDTO mayorista) {
		this.mayorista = mayorista;
	}

	/**
	 * Sets the minorista.
	 *
	 * @param minorista
	 *            the new minorista
	 */
	public void setMinorista(MinoristaDTO minorista) {
		this.minorista = minorista;
	}

	/**
	 * Sets the producto pedidos.
	 *
	 * @param productoPedidos
	 *            the new producto pedidos
	 */
	public void setProductoPedidos(List<ProductoPedidoDTO> productoPedidos) {
		this.productoPedidos = productoPedidos;
	}

}
