package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.ProductoPedido;
import com.hasl.tracket.model.repository.IRepositoryDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoPedidoDAO.
 */
@Repository
class ProductoPedidoService extends AbstractRepositoryDAO<ProductoPedido> implements
		IRepositoryDAO<ProductoPedido> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<ProductoPedido> getClazz() {
		return ProductoPedido.class;
	}

}
