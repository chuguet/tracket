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

	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<Administrador> getEntityModelClass() {
		return Administrador.class;
	}


}
