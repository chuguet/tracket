package com.hasl.tracket.controller.dto.mapper;

import java.util.List;

import com.hasl.tracket.controller.dto.MinoristaDTO;
import com.hasl.tracket.model.entity.Minorista;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMinoristaMapper.
 */
public interface IMinoristaMapper extends IMapper {

	/**
	 * From minorista dto list to minorista list.
	 *
	 * @param minoristasDTO
	 *            the minoristas dto
	 * @return the list
	 */
	List<Minorista> fromMinoristaDTOListToMinoristaList(
			List<MinoristaDTO> minoristasDTO);

	/**
	 * From minorista dto to minorista.
	 *
	 * @param minoristaDTO
	 *            the minorista dto
	 * @return the minorista
	 */
	Minorista fromMinoristaDTOToMinorista(MinoristaDTO minoristaDTO);

	/**
	 * From minorista list to minorista dto list.
	 *
	 * @param minoristas
	 *            the minoristas
	 * @return the list
	 */
	List<MinoristaDTO> fromMinoristaListToMinoristaDTOList(
			List<Minorista> minoristas);

	/**
	 * From minorista to minorista dto.
	 *
	 * @param minorista
	 *            the minorista
	 * @return the minorista dto
	 */
	MinoristaDTO fromMinoristaToMinoristaDTO(Minorista minorista);
}
