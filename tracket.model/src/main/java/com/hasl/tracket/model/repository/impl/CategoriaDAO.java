package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Categoria;
import com.hasl.tracket.model.repository.ICategoriaDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriaDAO.
 */
@Repository
class CategoriaDAO extends AbstractRepositoryDAO<Categoria> implements
		ICategoriaDAO {



	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<Categoria> getEntityModelClass() {
		return Categoria.class;
	}

}
