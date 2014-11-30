package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.Pedido;
import com.hasl.tracket.model.repository.IPedidoDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class PedidoDAO.
 */
@Repository
class PedidoDAO extends AbstractRepositoryDAO<Pedido> implements IPedidoDAO {



	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<Pedido> getEntityModelClass() {
		return Pedido.class;
	}

}
