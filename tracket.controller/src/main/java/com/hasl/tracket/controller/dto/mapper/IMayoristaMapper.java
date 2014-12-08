package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.MayoristaDTO;
import com.hasl.tracket.model.entity.Mayorista;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMayoristaMapper.
 */
public interface IMayoristaMapper extends IMapper {

	/**
	 * From mayorista dto list to mayorista list.
	 *
	 * @param mayoristasDTO
	 *            the mayoristas dto
	 * @return the list
	 */
	List<Mayorista> fromMayoristaDTOListToMayoristaList(
			List<MayoristaDTO> mayoristasDTO);

	/**
	 * From mayorista dto to mayorista.
	 *
	 * @param mayoristaDTO
	 *            the mayorista dto
	 * @return the mayorista
	 */
	Mayorista fromMayoristaDTOToMayorista(MayoristaDTO mayoristaDTO);

	/**
	 * From mayorista list to mayorista dto list.
	 *
	 * @param mayoristas
	 *            the mayoristas
	 * @return the list
	 */
	List<MayoristaDTO> fromMayoristaListToMayoristaDTOList(
			List<Mayorista> mayoristas);

	/**
	 * From mayorista to mayorista dto.
	 *
	 * @param mayorista
	 *            the mayorista
	 * @return the mayorista dto
	 */
	MayoristaDTO fromMayoristaToMayoristaDTO(Mayorista mayorista);

}
