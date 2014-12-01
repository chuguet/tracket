package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.UsuarioDTO;
import com.hasl.tracket.model.entity.Usuario;

public interface IUsuarioMapper {

	Usuario fromUsuarioDTOToUsuario(UsuarioDTO usuarioDTO);

	UsuarioDTO fromUsuarioToUsuarioDTO(Usuario usuario);

}
