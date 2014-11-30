package com.hasl.tracket.model.repository.impl;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.repository.IRepositoryDAO;

abstract class AbstractRepositoryDAO<T extends IModelEntity> implements
		IRepositoryDAO<T> {

	/** The hibernate template. */
	@Inject
	private HibernateTemplate hibernateTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.upsam.hospital.model.repository.IRepositoryDAO#delete(com.upsam.hospital
	 * .model.beans.IModelHospital)
	 */
	@Override
	public void delete(T t) throws SQLException {
		hibernateTemplate.delete(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.upsam.hospital.model.repository.IRepositoryDAO#findAll()
	 */
	@Override
	public List<T> findAll() throws SQLException {
		return hibernateTemplate.loadAll(getEntityModelClass());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.upsam.hospital.model.repository.IRepositoryDAO#findOne(java.lang.
	 * Integer)
	 */
	@Override
	public T findOne(Integer pId) throws SQLException {
		return hibernateTemplate.get(getEntityModelClass(), pId);
	}



	/**
	 * Gets the hibernate template.
	 * 
	 * @return the hibernate template
	 */
	protected HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.upsam.hospital.model.repository.IRepositoryDAO#save(com.upsam.hospital
	 * .model.beans.IModelHospital)
	 */
	@Override
	public Integer save(T t) throws SQLException {
		return (Integer) hibernateTemplate.save(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.upsam.hospital.model.repository.IRepositoryDAO#update(com.upsam.hospital
	 * .model.beans.IModelHospital)
	 */
	@Override
	public void update(T t) throws SQLException {
		hibernateTemplate.update(t);
	}

}
