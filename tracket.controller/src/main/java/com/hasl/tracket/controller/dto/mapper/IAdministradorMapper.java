package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.AdministradorDTO;
import com.hasl.tracket.model.entity.Administrador;

// TODO: Auto-generated Javadoc
/**
 * The Interface IAdministradorMapper.
 */
public interface IAdministradorMapper extends IMapper {

	/**
	 * From Administrador dto list to Administrador list.
	 *
	 * @param administradoresDTO
	 *            the administradores dto
	 * @return the list
	 */
	List<Administrador> fromAdministradorDTOListToAdministradorList(
			List<AdministradorDTO> administradoresDTO);

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
	 * From Administrador list to Administrador dto list.
	 *
	 * @param administradores
	 *            the administradores
	 * @return the list
	 */
	List<AdministradorDTO> fromAdministradorListToAdministradorDTOList(
			List<Administrador> administradores);

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
