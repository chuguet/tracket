package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.UsuarioDTO;
import com.hasl.tracket.model.entity.Usuario;

// TODO: Auto-generated Javadoc
/**
 * The Interface IUsuarioMapper.
 */
public interface IUsuarioMapper extends IMapper {

	/**
	 * From usuario dto list to usuario list.
	 *
	 * @param usuarioDTO
	 *            the usuarios dto
	 * @return the list
	 */
	List<Usuario> fromUsuarioDTOListToUsuarioList(List<UsuarioDTO> usuariosDTO);

	/**
	 * From usuario dto to usuario.
	 *
	 * @param usuarioDTO
	 *            the usuario dto
	 * @return the usuario
	 */
	Usuario fromUsuarioDTOToUsuario(UsuarioDTO usuarioDTO);

	/**
	 * From usuario list to usuario dto list.
	 *
	 * @param usuarios
	 *            the usuarios
	 * @return the list
	 */
	List<UsuarioDTO> fromUsuarioListToUsuarioDTOList(List<Usuario> usuarios);

	/**
	 * From usuario to usuario dto.
	 *
	 * @param usuario
	 *            the usuario
	 * @return the usuario dto
	 */
	UsuarioDTO fromUsuarioToUsuarioDTO(Usuario usuario);
}
