package com.hasl.tracket.model.repository.impl;

import org.springframework.stereotype.Repository;

import com.hasl.tracket.model.entity.TipoUsuario;
import com.hasl.tracket.model.repository.ITipoUsuarioDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class TipoUsuarioDAO.
 */
@Repository
class TipoUsuarioDAO extends AbstractRepositoryDAO<TipoUsuario>
		implements ITipoUsuarioDAO {

	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.repository.impl.AbstractRepositoryDAO#getClazz()
	 */
	@Override
	protected Class<TipoUsuario> getClazz() {
		return TipoUsuario.class;
	}

}
