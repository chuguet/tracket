package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Categoria;
import com.hasl.tracket.model.service.ICategoriaService;


/**
 * The Class CategoriaServiceImpl.
 */
@Service
class CategoriaServiceImpl extends AbstractModelService<Categoria> implements
		ICategoriaService {


	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Categoria> getClazz() {
		return Categoria.class;
	}

}
