package com.hasl.tracket.model.service;

import com.hasl.tracket.model.entity.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Interface IUsuarioService.
 */
public interface IUsuarioService extends IModelService<Usuario> {

	/**
	 * Select by email.
	 *
	 * @param email
	 *            the email
	 * @return the usuario
	 */
	Usuario selectByEmail(String email);

}
