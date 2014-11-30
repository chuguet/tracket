package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Minorista;
import com.hasl.tracket.model.service.IMinoristaService;

/**
 * The Class MinoristaServiceImpl.
 */
@Service
class MinoristaServiceImpl extends AbstractModelService<Minorista> implements
		IMinoristaService {


	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Minorista> getClazz() {
		return Minorista.class;
	}

}
