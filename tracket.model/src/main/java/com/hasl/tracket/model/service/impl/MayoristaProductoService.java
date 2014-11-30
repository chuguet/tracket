package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.MayoristaProducto;
import com.hasl.tracket.model.repository.IMayoristaProductoDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaProductoDAO.
 */
@Repository
class MayoristaProductoService extends AbstractRepositoryDAO<MayoristaProducto>
		implements IMayoristaProductoDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<MayoristaProducto> getClazz() {
		return MayoristaProducto.class;
	}

}
