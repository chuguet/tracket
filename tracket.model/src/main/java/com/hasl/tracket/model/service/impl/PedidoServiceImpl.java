package com.hasl.tracket.model.service.impl;

import org.springframework.stereotype.Service;

import com.hasl.tracket.model.entity.Pedido;
import com.hasl.tracket.model.service.IPedidoService;

/**
 * The Class PedidoServiceImpl.
 */
@Service
class PedidoServiceImpl extends AbstractModelService<Pedido> implements IPedidoService {


	/* (non-Javadoc)
	 * @see com.hasl.tracket.model.service.impl.AbstractModelService#getClazz()
	 */
	@Override
	public Class<Pedido> getClazz() {
		return Pedido.class;
	}

}
