package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.CategoriaDTO;
import com.hasl.tracket.model.entity.Categoria;

// TODO: Auto-generated Javadoc
/**
 * The Interface ICategoriaMapper.
 */
public interface ICategoriaMapper extends IMapper {

	/**
	 * From categoria dto to categoria.
	 *
	 * @param categoriaDTO
	 *            the categoria dto
	 * @return the categoria
	 */
	Categoria fromCategoriaDTOToCategoria(CategoriaDTO categoriaDTO);

	/**
	 * From categoria to categoria dto.
	 *
	 * @param categoria
	 *            the categoria
	 * @return the categoria dto
	 */
	CategoriaDTO fromCategoriaToCategoriaDTO(Categoria categoria);
}
