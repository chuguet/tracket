package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Usuario;
import com.hasl.tracket.model.service.IUsuarioService;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioService.
 */
@Service
class UsuarioService extends AbstractModelService<Usuario> implements
		IUsuarioService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Usuario> getClazz() {
		return Usuario.class;
	}

}
