package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.MayoristaProducto;
import com.hasl.tracket.model.service.IMayoristaProductoService;

/**
 * The Class MayoristaProductoServiceImpl.
 */
@Service
class MayoristaProductoServiceImpl extends AbstractModelService<MayoristaProducto>
		implements IMayoristaProductoService	 {

	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<MayoristaProducto> getClazz() {
		return MayoristaProducto.class;
	}

}
