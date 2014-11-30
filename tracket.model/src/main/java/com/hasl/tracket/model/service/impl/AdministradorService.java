package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Administrador;
import com.hasl.tracket.model.repository.IAdministradorDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class AdministradorDAO.
 */
@Repository
class AdministradorService extends AbstractModelService<Administrador> implements
		IAdministradorDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<Administrador> getClazz() {
		return Administrador.class;
	}

}
