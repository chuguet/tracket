package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Minorista;
import com.hasl.tracket.model.service.IMinoristaService;

// TODO: Auto-generated Javadoc
/**
 * The Class MinoristaServiceImpl.
 */
@Service
class MinoristaServiceImpl extends AbstractModelService<Minorista> implements
		IMinoristaService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.impl.AbstractModelService#getEntityModelClass
	 * ()
	 */
	@Override
	public Class<Minorista> getEntityModelClass() {
		return Minorista.class;
	}

}
