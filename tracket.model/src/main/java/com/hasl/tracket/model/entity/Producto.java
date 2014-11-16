package com.hasl.tracket.model.entity;

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
 * The Class Producto.
 */
@Entity
@Table(name = "PRODUCTO")
public class Producto implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -95911591047944974L;

	/** The categoria. */
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIA")
	private Categoria categoria;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUCTO")
	private Integer id;

	/** The nombre. */
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;

	/** The tamano. */
	@Basic
	@Column(name = "TAMANO")
	private String tamano;

	/** The usuario productos. */
	@OneToMany(mappedBy = "producto")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<UsuarioProducto> usuarioProductos;

	/**
	 * Gets the categoria.
	 *
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
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
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
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
	 * Gets the usuario productos.
	 *
	 * @return the usuario productos
	 */
	public List<UsuarioProducto> getUsuarioProductos() {
		return usuarioProductos;
	}

	/**
	 * Sets the categoria.
	 *
	 * @param categoria
	 *            the new categoria
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
	 * Sets the nombre.
	 *
	 * @param nombre
	 *            the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Sets the tamano.
	 *
	 * @param tamano
	 *            the new tamano
	 */
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	/**
	 * Sets the usuario productos.
	 *
	 * @param usuarioProductos
	 *            the new usuario productos
	 */
	public void setUsuarioProductos(List<UsuarioProducto> usuarioProductos) {
		this.usuarioProductos = usuarioProductos;
	}

}
