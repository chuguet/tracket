package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.ProductoPedido;
import com.hasl.tracket.model.repository.IRepositoryDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoPedidoDAO.
 */
@Repository
class ProductoPedidoDAO extends AbstractRepositoryDAO<ProductoPedido> implements
		IRepositoryDAO<ProductoPedido> {



	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<ProductoPedido> getEntityModelClass() {
		return ProductoPedido.class;
	}

}
