package com.hasl.tracket.model.entity;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

// TODO: Auto-generated Javadoc
/**
 * The Class Categoria.
 */
@Entity
@Table(name = "CATEGORIA")
public class Categoria implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3422534353180887529L;
	
	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATEGORIA")
	private Integer id;
	
	/** The nombre. */
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;
	
	/** The productos. */
	@OneToMany(mappedBy= "categoria")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Producto> productos;

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
	 * Gets the productos.
	 *
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
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
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
}
