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
 * The Class Usuario.
 */
@Entity
@Table(name = "USUARIO")
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

	/** The tipo usuario. */
	@ManyToOne
	@JoinColumn(name = "ID_TIPO_USUARIO")
	private TipoUsuario tipoUsuario;

	/** The user. */
	@Basic
	@Column(name = "USER", unique = true)
	private String user;

	/** The usuario producto. */
	@OneToMany(mappedBy = "usuario")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<UsuarioProducto> usuarioProductos;

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
	 * Gets the tipo usuario.
	 *
	 * @return the tipo usuario
	 */
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * Gets the usuario producto.
	 *
	 * @return the usuario producto
	 */
	public List<UsuarioProducto> getUsuarioProducto() {
		return usuarioProductos;
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
	 * Sets the tipo usuario.
	 *
	 * @param tipoUsuario
	 *            the new tipo usuario
	 */
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	/**
	 * Sets the user.
	 *
	 * @param user
	 *            the new user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * Sets the usuario producto.
	 *
	 * @param usuarioProductos the new usuario producto
	 */
	public void setUsuarioProducto(List<UsuarioProducto> usuarioProductos) {
		this.usuarioProductos = usuarioProductos;
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
