package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.UsuarioDTO;
import com.hasl.tracket.model.entity.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Interface IUsuarioMapper.
 */
public interface IUsuarioMapper extends IMapper {

	/**
	 * From usuario dto to usuario.
	 *
	 * @param usuarioDTO
	 *            the usuario dto
	 * @return the usuario
	 */
	Usuario fromUsuarioDTOToUsuario(UsuarioDTO usuarioDTO);

	/**
	 * From usuario to usuario dto.
	 *
	 * @param usuario
	 *            the usuario
	 * @return the usuario dto
	 */
	UsuarioDTO fromUsuarioToUsuarioDTO(Usuario usuario);
}
