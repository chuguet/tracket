package com.hasl.tracket.controller.dto.mapper.factory;

import com.hasl.tracket.controller.dto.mapper.IMapper;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating IMapper objects.
 */
public interface IMapperFactory {

	/**
	 * Gets the mapper.
	 *
	 * @param clazz
	 *            the clazz
	 * @return the mapper
	 */
	IMapper getMapper(MapperType mapperType);
}
