package com.hasl.tracket.controller.control;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hasl.tracket.controller.dto.MensajeDTO;
import com.hasl.tracket.controller.dto.MinoristaDTO;
import com.hasl.tracket.controller.dto.mapper.IMinoristaMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Minorista;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;
import com.hasl.tracket.model.service.IMinoristaService;

// TODO: Auto-generated Javadoc
/**
 * The Class MinoristaController.
 */
@Controller
@RequestMapping("/usuario/minorista")
public class MinoristaController extends AbstractController {

	/** The Constant LOG. */
	private final static Log LOG = LogFactory.getLog(MinoristaController.class);

	/** The minorista service. */
	@Inject
	private IMinoristaService minoristaService;

	/**
	 * List all minorista.
	 *
	 * @return the list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<MinoristaDTO> listAllMinorista() {
		List<MinoristaDTO> minoristasDTO = null;
		IMinoristaMapper minoristaMapper = (IMinoristaMapper) getMapperFactory()
				.getMapper(MapperType.MINORISTA_MAPPER);
		try {
			List<Minorista> minoristas = this.minoristaService.findAll();
			minoristasDTO = minoristaMapper
					.fromMinoristaListToMinoristaDTOList(minoristas);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return minoristasDTO;
	}

	/**
	 * Insert minorista.
	 *
	 * @param minoristaDTO
	 *            the minorista dto
	 * @return the mensaje dto
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody MensajeDTO insertMinorista(
			@RequestBody MinoristaDTO minoristaDTO) {

		if (minoristaDTO == null) {
			return new MensajeDTO("Un minorista es requerido", false);
		}
		try {
			IMinoristaMapper minoristaMapper = (IMinoristaMapper) getMapperFactory()
					.getMapper(MapperType.MINORISTA_MAPPER);
			Minorista minorista = minoristaMapper
					.fromMinoristaDTOToMinorista(minoristaDTO);
			minoristaService.save(minorista);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer("Ya existe el minorista ")
					.append(minoristaDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
		return new MensajeDTO("Minorista creado correctamente", true);
	}

}
