package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Usuario;
import com.hasl.tracket.model.service.IUsuarioService;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioDAO.
 */
@Service
class UsuarioService extends AbstractModelService<Usuario> implements
		IUsuarioService {

	@Override
	public Class<Usuario> getClazz() {
		return Usuario.class;
	}

}
