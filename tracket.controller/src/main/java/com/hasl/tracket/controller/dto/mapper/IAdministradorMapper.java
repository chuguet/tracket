package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.AdministradorDTO;
import com.hasl.tracket.model.entity.Administrador;

// TODO: Auto-generated Javadoc
/**
 * The Interface IAdministradorMapper.
 */
public interface IAdministradorMapper extends IMapper {

	/**
	 * From administrador dto to administrador.
	 *
	 * @param administradorDTO
	 *            the administrador dto
	 * @return the administrador
	 */
	Administrador fromAdministradorDTOToAdministrador(
			AdministradorDTO administradorDTO);

	/**
	 * From administrador to administrador dto.
	 *
	 * @param administrador
	 *            the administrador
	 * @return the administrador dto
	 */
	AdministradorDTO fromAdministradorToAdministradorDTO(
			Administrador administrador);
}
