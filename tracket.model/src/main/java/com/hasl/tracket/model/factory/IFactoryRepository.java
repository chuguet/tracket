package com.hasl.tracket.model.factory;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.repository.IRepositoryDAO;

public interface IFactoryRepository<T extends IModelEntity> {

	IRepositoryDAO<T> getRepositoryDAO (Class<T> clazz);
}
