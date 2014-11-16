package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.UsuarioProducto;
import com.hasl.tracket.model.repository.IUsuarioProductoDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class UsuarioProductoDAO.
 */
@Repository
class UsuarioProductoDAO extends AbstractRepositoryDAO<UsuarioProducto>
		implements IUsuarioProductoDAO {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<UsuarioProducto> getClazz() {
		return UsuarioProducto.class;
	}

}
