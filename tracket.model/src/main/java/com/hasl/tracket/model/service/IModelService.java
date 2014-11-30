package com.hasl.tracket.model.service;

import java.util.List;

import com.hasl.tracket.model.entity.IModelEntity;
import com.hasl.tracket.model.exception.DatabaseDeleteException;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;

// TODO: Auto-generated Javadoc
/**
 * The Interface IModelService.
 * 
 * @param <T>
 *            the generic type
 */
public interface IModelService<T extends IModelEntity> {

	/**
	 * Save.
	 * 
	 * @param t
	 *            the t
	 */
	Integer save(T t) throws DatabaseInsertException;

	/**
	 * Update.
	 * 
	 * @param t
	 *            the t
	 */
	void update(T t) throws DatabaseInsertException;

	/**
	 * Delete.
	 * 
	 * @param t
	 *            the t
	 */
	void delete(T t) throws DatabaseDeleteException;

	/**
	 * Find one.
	 * 
	 * @param pId
	 *            the id
	 * @return the t
	 */
	T findOne(Integer pId) throws DatabaseRetrieveException;

	/**
	 * Find all.
	 * 
	 * @return the list
	 */
	List<T> findAll() throws DatabaseRetrieveException;
}
