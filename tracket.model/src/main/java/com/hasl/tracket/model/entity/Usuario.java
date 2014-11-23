package com.hasl.tracket.model.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Usuario.
 */
@Entity
@Table(name = "USUARIO")
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements IModelEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2702895128691912804L;

	/** The apellidos. */
	@Basic
	@Column(name = "APELLIDOS")
	private String apellidos;

	/** The direccion. */
	@Basic
	@Column(name = "DIRECCION")
	private String direccion;

	/** The email. */
	@Basic
	@Column(name = "EMAIL", unique = true)
	private String email;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Integer id;

	/** The nombre. */
	@Basic
	@Column(name = "NOMBRE")
	private String nombre;

	/** The password. */
	@Basic
	@Column(name = "PASSWORD")
	private String password;

	/** The telefono. */
	@Basic
	@Column(name = "TELEFONO")
	private Integer telefono;

	/** The web. */
	@Basic
	@Column(name = "WEB")
	private String web;

	/**
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public Integer getTelefono() {
		return telefono;
	}

	/**
	 * Gets the web.
	 *
	 * @return the web
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos
	 *            the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion
	 *            the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Sets the email.
	 *
	 * @param email
	 *            the new email
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono
	 *            the new telefono
	 */
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	/**
	 * Sets the web.
	 *
	 * @param web
	 *            the new web
	 */
	public void setWeb(String web) {
		this.web = web;
	}
}
