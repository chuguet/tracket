package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Administrador;
import com.hasl.tracket.model.service.IAdministradorService;

/**
 * The Class AdministradorServiceImpl.
 */
@Service
class AdministradorServiceImpl extends AbstractModelService<Administrador> implements
		IAdministradorService {


	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Administrador> getClazz() {
		return Administrador.class;
	}

}
