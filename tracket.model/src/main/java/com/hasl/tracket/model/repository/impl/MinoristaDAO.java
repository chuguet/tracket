package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Minorista;
import com.hasl.tracket.model.repository.IMinoristaDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class MinoristaDAO.
 */
@Repository
class MinoristaDAO extends AbstractRepositoryDAO<Minorista> implements
		IMinoristaDAO {


	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<Minorista> getEntityModelClass() {
		return Minorista.class;
	}

}
