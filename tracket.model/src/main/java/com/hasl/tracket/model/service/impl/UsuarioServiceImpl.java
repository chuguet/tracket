package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Usuario;
import com.hasl.tracket.model.service.IUsuarioService;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioService.
 */
@Service
class UsuarioServiceImpl extends AbstractModelService<Usuario> implements
		IUsuarioService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.impl.AbstractModelService#getEntityModelClass
	 * ()
	 */
	@Override
	public Class<Usuario> getEntityModelClass() {
		return Usuario.class;
	}

	@Override
	public Usuario selectByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
