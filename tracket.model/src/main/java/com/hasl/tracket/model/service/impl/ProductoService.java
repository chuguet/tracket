package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Producto;
import com.hasl.tracket.model.repository.IProductoDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoDAO.
 */
@Repository
class ProductoService extends AbstractRepositoryDAO<Producto> implements
		IProductoDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<Producto> getClazz() {
		return Producto.class;
	}

}
