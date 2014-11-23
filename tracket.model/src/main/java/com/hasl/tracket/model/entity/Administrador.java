package com.hasl.tracket.model.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Administrador.
 */
@Entity
@Table(name = "ADMINISTRADOR")
@PrimaryKeyJoinColumn(name = "ID_USUARIO")
public class Administrador extends Usuario {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3167373798793758936L;

}
