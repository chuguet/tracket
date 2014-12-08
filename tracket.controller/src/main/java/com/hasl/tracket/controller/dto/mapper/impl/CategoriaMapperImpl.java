package com.hasl.tracket.controller.dto.mapper.impl;

import org.springframework.stereotype.Component;

import com.hasl.tracket.controller.dto.CategoriaDTO;
import com.hasl.tracket.controller.dto.mapper.ICategoriaMapper;
import com.hasl.tracket.controller.dto.mapper.IProductoMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Categoria;

@Component
public class CategoriaMapperImpl extends AbstractMapper implements
		ICategoriaMapper {

	@Override
	public MapperType getMapperType() {
		return MapperType.CATEGORIA_MAPPER;
	}

	@Override
	public Categoria fromCategoriaDTOToCategoria(CategoriaDTO categoriaDTO) {
		Categoria categoria = new Categoria();
		categoria.setId(categoriaDTO.getId());
		categoria.setNombre(categoriaDTO.getNombre());
		IProductoMapper productoMapper = (IProductoMapper) getMapperFactory()
				.getMapper(MapperType.PRODUCTO_MAPPER);
		if (categoriaDTO.getProductos()!= null){
			categoria
			.setProductos(productoMapper
					.fromProductoDTOListToProductoList(categoriaDTO
							.getProductos()));
		}

		return categoria;
	}

	@Override
	public CategoriaDTO fromCategoriaToCategoriaDTO(Categoria categoria) {
		// TODO Auto-generated method stub
		return null;
	}

}
