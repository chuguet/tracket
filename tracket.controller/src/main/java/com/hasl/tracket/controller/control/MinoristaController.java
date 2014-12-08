package com.hasl.tracket.controller.control;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hasl.tracket.controller.dto.MensajeDTO;
import com.hasl.tracket.controller.dto.MinoristaDTO;
import com.hasl.tracket.controller.dto.mapper.IMinoristaMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Minorista;
import com.hasl.tracket.model.exception.DatabaseDeleteException;
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
	public @ResponseBody List<MinoristaDTO> listAll() {
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
	public @ResponseBody MensajeDTO insert(
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
			return new MensajeDTO("Minorista creado correctamente", true);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer("Ya existe el minorista ")
					.append(minoristaDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
	}

	/**
	 * Removes the.
	 *
	 * @param id
	 *            the id
	 * @param uiModel
	 *            the ui model
	 * @return the mensaje dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public @ResponseBody MensajeDTO remove(@PathVariable Integer id,
			Model uiModel) {
		if (id == null) {
			return new MensajeDTO("Un minorista es requerido", false);
		}
		try {
			Minorista minorista = new Minorista();
			minorista.setId(id);
			this.minoristaService.delete(minorista);
			return new MensajeDTO("Minorista eliminado correctamente", true);
		} catch (DatabaseDeleteException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO("El minorista no ha podido ser borrado",
					false);
		}
	}

	/**
	 * Retrieve.
	 *
	 * @param id
	 *            the id
	 * @return the minorista dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody MinoristaDTO retrieve(@PathVariable("id") Integer id) {
		MinoristaDTO minoristaDTO = new MinoristaDTO();
		try {
			Minorista minorista = this.minoristaService.findOne(id);
			IMinoristaMapper minoristaMapper = (IMinoristaMapper) getMapperFactory()
					.getMapper(MapperType.MINORISTA_MAPPER);
			minoristaDTO = minoristaMapper
					.fromMinoristaToMinoristaDTO(minorista);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return minoristaDTO;
	}

	/**
	 * Update.
	 *
	 * @param minoristaDTO
	 *            the minorista dto
	 * @return the mensaje dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody MensajeDTO update(
			@RequestBody MinoristaDTO minoristaDTO) {
		if (minoristaDTO == null) {
			return new MensajeDTO("Un minorista es requerido", false);
		}
		try {
			IMinoristaMapper minoristaMapper = (IMinoristaMapper) getMapperFactory()
					.getMapper(MapperType.MINORISTA_MAPPER);
			Minorista minorista = minoristaMapper
					.fromMinoristaDTOToMinorista(minoristaDTO);
			minoristaService.update(minorista);
			return new MensajeDTO("Minorista modificado correctamente", true);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer(
					"No se ha podido actualizar el minorista ")
					.append(minoristaDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
	}

}
