package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.MayoristaDTO;
import com.hasl.tracket.model.entity.Mayorista;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMayoristaMapper.
 */
public interface IMayoristaMapper extends IMapper {

	/**
	 * From mayorista dto to mayorista.
	 *
	 * @param mayoristaDTO
	 *            the mayorista dto
	 * @return the mayorista
	 */
	Mayorista fromMayoristaDTOToMayorista(MayoristaDTO mayoristaDTO);

	/**
	 * From mayorista to mayorista dto.
	 *
	 * @param mayorista
	 *            the mayorista
	 * @return the mayorista dto
	 */
	MayoristaDTO fromMayoristaToMayoristaDTO(Mayorista mayorista);

}
