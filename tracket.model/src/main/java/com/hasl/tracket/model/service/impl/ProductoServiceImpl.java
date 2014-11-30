package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Producto;
import com.hasl.tracket.model.service.IProductoService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoServiceImpl.
 */
@Service
class ProductoServiceImpl extends AbstractModelService<Producto> implements
		IProductoService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Producto> getClazz() {
		return Producto.class;
	}

}
