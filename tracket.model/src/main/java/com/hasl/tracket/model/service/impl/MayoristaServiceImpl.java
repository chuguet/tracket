package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Mayorista;
import com.hasl.tracket.model.service.IMayoristaService;

/**
 * The Class MayoristaServiceImpl.
 */
@Service
class MayoristaServiceImpl extends AbstractModelService<Mayorista> implements
		IMayoristaService {

	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Mayorista> getClazz() {
		return Mayorista.class;
	}

}
