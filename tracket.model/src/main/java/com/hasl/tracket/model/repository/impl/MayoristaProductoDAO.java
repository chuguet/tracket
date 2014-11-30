package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.MayoristaProducto;
import com.hasl.tracket.model.repository.IMayoristaProductoDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaProductoDAO.
 */
@Repository
class MayoristaProductoDAO extends AbstractRepositoryDAO<MayoristaProducto>
		implements IMayoristaProductoDAO {


	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.IRepositoryDAO#getEntityModelClass()
	 */
	@Override
	public Class<MayoristaProducto> getEntityModelClass() {
		return MayoristaProducto.class;
	}

}
