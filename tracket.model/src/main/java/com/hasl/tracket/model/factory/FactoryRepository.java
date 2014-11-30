package com.hasl.tracket.model.factory;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.repository.IRepositoryDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryRepository.
 *
 * @param <T>
 *            the generic type
 */
@Component
public class FactoryRepository<T extends IModelEntity> implements
		IFactoryRepository<T> {

	/** The repositories dao. */
	@Inject
	private List<IRepositoryDAO<T>> repositoriesDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.factory.IFactoryRepository#getRepositoryDAO(java
	 * .lang.Class)
	 */
	@Override
	public IRepositoryDAO<T> getRepositoryDAO(Class<T> clazz) {
		for (IRepositoryDAO<T> repository : repositoriesDAO) {
			if (clazz.equals(repository.getClass())) {
				return repository;
			}
		}
		return null;
	}

}
