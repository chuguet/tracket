package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Minorista;
import com.hasl.tracket.model.repository.IMinoristaDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class MinoristaDAO.
 */
@Repository
class MinoristaServiceImpl extends AbstractRepositoryDAO<Minorista> implements
		IMinoristaDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<Minorista> getClazz() {
		return Minorista.class;
	}

}
