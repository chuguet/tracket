package com.hasl.tracket.controller.dto.mapper;

import com.hasl.tracket.controller.dto.MinoristaDTO;
import com.hasl.tracket.model.entity.Minorista;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMinoristaMapper.
 */
public interface IMinoristaMapper extends IMapper {

	/**
	 * From minorista dto to minorista.
	 *
	 * @param minoristaDTO
	 *            the minorista dto
	 * @return the minorista
	 */
	Minorista fromMinoristaDTOToMinorista(MinoristaDTO minoristaDTO);

	/**
	 * From minorista to minorista dto.
	 *
	 * @param minorista
	 *            the minorista
	 * @return the minorista dto
	 */
	MinoristaDTO fromMinoristaToMinoristaDTO(Minorista minorista);
}
