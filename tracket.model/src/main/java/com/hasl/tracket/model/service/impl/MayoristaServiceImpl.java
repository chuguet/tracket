package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Mayorista;
import com.hasl.tracket.model.service.IMayoristaService;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaServiceImpl.
 */
@Service
class MayoristaServiceImpl extends AbstractModelService<Mayorista> implements
		IMayoristaService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.impl.AbstractModelService#getEntityModelClass
	 * ()
	 */
	@Override
	public Class<Mayorista> getEntityModelClass() {
		return Mayorista.class;
	}

}
