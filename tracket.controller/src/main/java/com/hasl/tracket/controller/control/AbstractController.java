package com.hasl.tracket.controller.control;

import javax.inject.Inject;

import com.hasl.tracket.controller.dto.mapper.factory.IMapperFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractController.
 */
public abstract class AbstractController {
	
	/** The mapper factory. */
	@Inject
	private IMapperFactory mapperFactory;

	/**
	 * Gets the mapper factory.
	 *
	 * @return the mapper factory
	 */
	public IMapperFactory getMapperFactory() {
		return mapperFactory;
	}

	/**
	 * Sets the mapper factory.
	 *
	 * @param mapperFactory the new mapper factory
	 */
	public void setMapperFactory(IMapperFactory mapperFactory) {
		this.mapperFactory = mapperFactory;
	}
	
	

}
