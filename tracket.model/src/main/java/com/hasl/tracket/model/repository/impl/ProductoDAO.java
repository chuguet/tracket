package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Producto;
import com.hasl.tracket.model.repository.IProductoDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoDAO.
 */
@Repository
class ProductoDAO extends AbstractRepositoryDAO<Producto> implements
		IProductoDAO {



	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<Producto> getEntityModelClass() {
		return Producto.class;
	}

}
