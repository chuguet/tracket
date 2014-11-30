package com.hasl.tracket.model.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.exception.DatabaseDeleteException;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;
import com.hasl.tracket.model.factory.IFactoryRepository;
import com.hasl.tracket.model.repository.IRepositoryDAO;
import com.hasl.tracket.model.service.IModelService;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractModelService.
 *
 * @param <T>
 *            the generic type
 */
public abstract class AbstractModelService<T extends IModelEntity> implements
		IModelService<T> {

	/** The Constant LOG. */
	private static final Log LOG = LogFactory
			.getLog(AbstractModelService.class);

	/** The factory repository. */
	@Inject
	private IFactoryRepository<T> factoryRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.IModelService#delete(com.hasl.tracket.
	 * model.entity.IModelEntity)
	 */
	@Override
	public void delete(T t) throws DatabaseDeleteException {
		try {
			IRepositoryDAO<T> repository = factoryRepository
					.getRepositoryDAO(this.getClazz());
			repository.delete(t);
		} catch (SQLException e) {
			LOG.error("Error al actualizar una entidad");
			throw new DatabaseDeleteException(e.getMessage(), e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.model.service.IModelService#findAll()
	 */
	@Override
	public List<T> findAll() throws DatabaseRetrieveException {
		List<T> t = null;
		try {
			IRepositoryDAO<T> repository = factoryRepository
					.getRepositoryDAO(this.getClazz());
			t = repository.findAll();
		} catch (SQLException e) {
			LOG.error("Error al buscar todas las entidades");
			throw new DatabaseRetrieveException(e.getMessage(), e);
		}
		return t;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.IModelService#findOne(java.lang.Integer)
	 */
	@Override
	public T findOne(Integer pId) throws DatabaseRetrieveException {
		T t = null;
		try {
			IRepositoryDAO<T> repository = factoryRepository
					.getRepositoryDAO(this.getClazz());
			t = repository.findOne(pId);
		} catch (SQLException e) {
			LOG.error("Error al buscar una entidad");
			throw new DatabaseRetrieveException(e.getMessage(), e);
		}
		return t;
	}

	/**
	 * Gets the clazz.
	 *
	 * @return the clazz
	 */
	public abstract Class<T> getClazz();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.IModelService#save(com.hasl.tracket.model
	 * .entity.IModelEntity)
	 */
	@Override
	public Integer save(T t) throws DatabaseInsertException {
		Integer result = null;
		try {
			IRepositoryDAO<T> repository = factoryRepository
					.getRepositoryDAO(this.getClazz());
			result = repository.save(t);
		} catch (SQLException e) {
			LOG.error("Error al salvar una entidad");
			throw new DatabaseDeleteException(e.getMessage(), e);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.IModelService#update(com.hasl.tracket.
	 * model.entity.IModelEntity)
	 */
	@Override
	public void update(T t) throws DatabaseInsertException {
		try {
			IRepositoryDAO<T> repository = factoryRepository
					.getRepositoryDAO(this.getClazz());
			repository.update(t);
		} catch (SQLException e) {
			LOG.error("Error al actualizar una entidad");
			throw new DatabaseInsertException(e.getMessage(), e);
		}
	}

}
