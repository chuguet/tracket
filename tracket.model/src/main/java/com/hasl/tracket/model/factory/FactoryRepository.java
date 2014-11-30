package com.hasl.tracket.model.factory;

import java.util.List;

import javax.inject.Inject;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.repository.IRepositoryDAO;

public class FactoryRepository<T extends IModelEntity> implements IFactoryRepository<T>{

	@Inject
	private List<IRepositoryDAO<T>> repositoriesDAO;
	
	@Override
	public IRepositoryDAO<T> getRepositoryDAO(Class<T> clazz) {
		for(IRepositoryDAO<T> repository : repositoriesDAO){
			if(clazz.equals(repository.getClass())){
				return repository;
			}
		}
		return null;
	}

}
