package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.ProductoPedido;
import com.hasl.tracket.model.service.IProductoPedidoService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductoPedidoServiceImpl.
 */
@Service
class ProductoPedidoServiceImpl extends AbstractModelService<ProductoPedido>
		implements IProductoPedidoService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.hasl.tracket.model.service.impl.AbstractModelService#getEntityModelClass
	 * ()
	 */
	@Override
	public Class<ProductoPedido> getEntityModelClass() {
		return ProductoPedido.class;
	}

}
