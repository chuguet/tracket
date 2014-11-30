package com.hasl.tracket.model.factory;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.repository.IRepositoryDAO;

// TODO: Auto-generated Javadoc
/**
 * The Interface IFactoryRepository.
 *
 * @param <T>
 *            the generic type
 */
public interface IFactoryRepository<T extends IModelEntity> {

	/**
	 * Gets the repository dao.
	 *
	 * @param clazz
	 *            the clazz
	 * @return the repository dao
	 */
	IRepositoryDAO<T> getRepositoryDAO(Class<T> clazz);
}
