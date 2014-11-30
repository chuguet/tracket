package com.hasl.tracket.model.service.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.exception.DatabaseDeleteException;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;
import com.hasl.tracket.model.factory.IFactoryRepository;
import com.hasl.tracket.model.repository.IRepositoryDAO;
import com.hasl.tracket.model.service.IModelService;

public abstract class AbstractModelService<T extends IModelEntity> implements
		IModelService<T> {

	@Inject
	private IFactoryRepository<T> factoryRepository;

	public abstract Class<T> getClazz();

	@Override
	public Integer save(T t) throws DatabaseInsertException {
		Integer result = null;
		try {
			IRepositoryDAO<T> repository = factoryRepository
					.getRepositoryDAO(this.getClazz());
			result = repository.save(t);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void update(T t) throws DatabaseInsertException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(T t) throws DatabaseDeleteException {
		// TODO Auto-generated method stub

	}

	@Override
	public T findOne(Integer pId) throws DatabaseRetrieveException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() throws DatabaseRetrieveException {
		// TODO Auto-generated method stub
		return null;
	}

}
