package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Administrador;
import com.hasl.tracket.model.repository.IAdministradorDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class AdministradorDAO.
 */
@Repository
class AdministradorDAO extends AbstractRepositoryDAO<Administrador> implements
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
