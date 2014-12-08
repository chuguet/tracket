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

import com.hasl.tracket.controller.dto.MayoristaDTO;
import com.hasl.tracket.controller.dto.MensajeDTO;
import com.hasl.tracket.controller.dto.mapper.IMayoristaMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Mayorista;
import com.hasl.tracket.model.exception.DatabaseDeleteException;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;
import com.hasl.tracket.model.service.IMayoristaService;

// TODO: Auto-generated Javadoc
/**
 * The Class MayoristaController.
 */
@Controller
@RequestMapping("/usuario/mayorista")
public class MayoristaController extends AbstractController {

	/** The Constant LOG. */
	private final static Log LOG = LogFactory.getLog(MayoristaController.class);

	/** The mayorista service. */
	@Inject
	private IMayoristaService mayoristaService;

	/**
	 * Insert mayorista.
	 *
	 * @param mayoristaDTO
	 *            the mayorista dto
	 * @return the mensaje dto
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody MensajeDTO insert(
			@RequestBody MayoristaDTO mayoristaDTO) {
		if (mayoristaDTO == null) {
			return new MensajeDTO("Un mayorista es requerido", false);
		}
		try {
			IMayoristaMapper mayoristaMapper = (IMayoristaMapper) getMapperFactory()
					.getMapper(MapperType.MAYORISTA_MAPPER);
			Mayorista mayorista = mayoristaMapper
					.fromMayoristaDTOToMayorista(mayoristaDTO);
			mayoristaService.save(mayorista);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer("Ya existe el mayorista ")
					.append(mayoristaDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
		return new MensajeDTO("Mayorista creado correctamente", true);
	}

	/**
	 * List all mayorista.
	 *
	 * @return the list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<MayoristaDTO> listAll() {
		List<MayoristaDTO> mayoristasDTO = null;
		IMayoristaMapper mayoristaMapper = (IMayoristaMapper) getMapperFactory()
				.getMapper(MapperType.MAYORISTA_MAPPER);
		try {
			List<Mayorista> mayoristas = this.mayoristaService.findAll();
			mayoristasDTO = mayoristaMapper
					.fromMayoristaListToMayoristaDTOList(mayoristas);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return mayoristasDTO;
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
			return new MensajeDTO("Un mayorista es requerido", false);
		}
		try {
			Mayorista mayorista = new Mayorista();
			mayorista.setId(id);
			this.mayoristaService.delete(mayorista);
			return new MensajeDTO("Mayorista eliminado correctamente", true);
		} catch (DatabaseDeleteException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO("El mayorista no ha podido ser borrado",
					false);
		}
	}

	/**
	 * Retrieve.
	 *
	 * @param id
	 *            the id
	 * @return the mayorista dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody MayoristaDTO retrieve(@PathVariable("id") Integer id) {
		MayoristaDTO mayoristaDTO = new MayoristaDTO();
		try {
			Mayorista mayorista = this.mayoristaService.findOne(id);
			IMayoristaMapper mayoristaMapper = (IMayoristaMapper) getMapperFactory()
					.getMapper(MapperType.MAYORISTA_MAPPER);
			mayoristaDTO = mayoristaMapper
					.fromMayoristaToMayoristaDTO(mayorista);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return mayoristaDTO;
	}

	/**
	 * Update.
	 *
	 * @param mayoristaDTO
	 *            the mayorista dto
	 * @return the mensaje dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody MensajeDTO update(
			@RequestBody MayoristaDTO mayoristaDTO) {
		if (mayoristaDTO == null) {
			return new MensajeDTO("Un mayorista es requerido", false);
		}
		try {
			IMayoristaMapper mayoristaMapper = (IMayoristaMapper) getMapperFactory()
					.getMapper(MapperType.MAYORISTA_MAPPER);
			Mayorista mayorista = mayoristaMapper
					.fromMayoristaDTOToMayorista(mayoristaDTO);
			mayoristaService.update(mayorista);
			return new MensajeDTO("Mayorista modificado correctamente", true);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer(
					"No se ha podido actualizar el mayorista ")
					.append(mayoristaDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
	}

}
