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
 * The Class TipoUsuario.
 */
@Entity
@Table(name = "TIPO_USUARIO")
public class TipoUsuario implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2115087606025646753L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_USUARIO")
	private Integer id;

	/** The tipo. */
	@Basic
	@Column(name = "TIPO")
	private String tipo;

	/** The usuarios. */
	@OneToMany(mappedBy = "tipoUsuario")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Usuario> usuarios;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Gets the usuarios.
	 *
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
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
	 * Sets the tipo.
	 *
	 * @param tipo
	 *            the new tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Sets the usuarios.
	 *
	 * @param usuarios
	 *            the new usuarios
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
