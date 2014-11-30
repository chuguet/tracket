package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Mayorista;
import com.hasl.tracket.model.repository.IMayoristaDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaDAO.
 */
@Repository
class MayoristaServiceImpl extends AbstractRepositoryDAO<Mayorista> implements
		IMayoristaDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<Mayorista> getClazz() {
		return Mayorista.class;
	}

}
