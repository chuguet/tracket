package com.hasl.tracket.controller.dto.mapper.factory;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.mapper.IMapper;

@Component
public class MapperFactoryImpl implements IMapperFactory {

	@Inject
	private List<IMapper> mappers;

	@Override
	public IMapper getMapper(MapperType mapperType) {
		IMapper mapperResult = null;
		for (IMapper mapper : mappers) {
			if (mapperType.equals(mapper.getMapperType())) {
				mapperResult = mapper;
				break;
			}
		}
		return mapperResult;
	}

}
