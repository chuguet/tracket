package com.hasl.tracket.model.repository;

import java.sql.SQLException;
import java.util.List;

import com.hasl.tracket.model.entity.Administrador;
import com.hasl.tracket.model.entity.IModelEntity;

// TODO: Auto-generated Javadoc
/**
 * The Interface IRepositoryDAO.
 * 
 * @param <T>
 *            the generic type
 */
public interface IRepositoryDAO<T extends IModelEntity> {

	/**
	 * Save.
	 *
	 * @param t
	 *            the t
	 * @return the integer
	 * @throws SQLException
	 *             the SQL exception
	 */
	Integer save(T t) throws SQLException;

	/**
	 * Update.
	 *
	 * @param t
	 *            the t
	 * @throws SQLException
	 *             the SQL exception
	 */
	void update(T t) throws SQLException;

	/**
	 * Delete.
	 *
	 * @param t
	 *            the t
	 * @throws SQLException
	 *             the SQL exception
	 */
	void delete(T t) throws SQLException;

	/**
	 * Find one.
	 *
	 * @param pId
	 *            the id
	 * @return the t
	 * @throws SQLException
	 *             the SQL exception
	 */
	T findOne(Integer pId) throws SQLException;

	/**
	 * Find all.
	 *
	 * @return the list
	 * @throws SQLException
	 *             the SQL exception
	 */
	List<T> findAll() throws SQLException;
	
	 /**
 	 * Gets the entity model class.
 	 *
 	 * @return the entity model class
 	 */
 	Class<T> getEntityModelClass();

}
