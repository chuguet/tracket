package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Categoria;
import com.hasl.tracket.model.service.ICategoriaService;

// TODO: Auto-generated Javadoc
/**
 * The Class CategoriaDAO.
 */
@Service
class CategoriaServiceImpl extends AbstractModelServices<Categoria> implements
		ICategoriaService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	public Class<Categoria> getClazz() {
		return Categoria.class;
	}

}
