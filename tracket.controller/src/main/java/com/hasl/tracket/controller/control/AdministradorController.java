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

import com.hasl.tracket.controller.dto.AdministradorDTO;
import com.hasl.tracket.controller.dto.MensajeDTO;
import com.hasl.tracket.controller.dto.mapper.IAdministradorMapper;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Administrador;
import com.hasl.tracket.model.exception.DatabaseDeleteException;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;
import com.hasl.tracket.model.service.IAdministradorService;

// TODO: Auto-generated Javadoc
/**
 * The Class AdministradorController.
 */
@Controller
@RequestMapping("/usuario/administrador")
public class AdministradorController extends AbstractController {

	/** The Constant LOG. */
	private final static Log LOG = LogFactory
			.getLog(AdministradorController.class);

	/** The administrador service. */
	@Inject
	private IAdministradorService administradorService;

	/**
	 * Insert administrador.
	 *
	 * @param administradorDTO
	 *            the administrador dto
	 * @return the mensaje dto
	 */
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody MensajeDTO insert(
			@RequestBody AdministradorDTO administradorDTO) {

		if (administradorDTO == null) {
			return new MensajeDTO("Un administrador es requerido", false);
		}
		try {
			IAdministradorMapper administradorMapper = (IAdministradorMapper) getMapperFactory()
					.getMapper(MapperType.ADMINISTRADOR_MAPPER);
			Administrador administrador = administradorMapper
					.fromAdministradorDTOToAdministrador(administradorDTO);
			administradorService.save(administrador);
			return new MensajeDTO("Administrador creado correctamente", true);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer(
					"Ya existe el administraddor ")
					.append(administradorDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
	}

	/**
	 * List all administrador.
	 *
	 * @return the list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<AdministradorDTO> listAll() {
		List<AdministradorDTO> administradoresDTO = null;
		IAdministradorMapper adminstradorMapper = (IAdministradorMapper) getMapperFactory()
				.getMapper(MapperType.ADMINISTRADOR_MAPPER);
		try {
			List<Administrador> administradores = this.administradorService
					.findAll();
			administradoresDTO = adminstradorMapper
					.fromAdministradorListToAdministradorDTOList(administradores);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return administradoresDTO;
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
			return new MensajeDTO("Un administrador es requerido", false);
		}
		try {
			Administrador administrador = new Administrador();
			administrador.setId(id);
			this.administradorService.delete(administrador);
			return new MensajeDTO("Administrador eliminado correctamente", true);
		} catch (DatabaseDeleteException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO("El administrador no ha podido ser borrado",
					false);
		}
	}

	/**
	 * Retrieve.
	 *
	 * @param id
	 *            the id
	 * @return the administrador dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody AdministradorDTO retrieve(
			@PathVariable("id") Integer id) {
		AdministradorDTO administradorDTO = new AdministradorDTO();
		try {
			Administrador administrador = this.administradorService.findOne(id);
			IAdministradorMapper administradorMapper = (IAdministradorMapper) getMapperFactory()
					.getMapper(MapperType.ADMINISTRADOR_MAPPER);
			administradorDTO = administradorMapper
					.fromAdministradorToAdministradorDTO(administrador);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return administradorDTO;
	}

	/**
	 * Update.
	 *
	 * @param administradorDTO
	 *            the administrador dto
	 * @return the mensaje dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody MensajeDTO update(
			@RequestBody AdministradorDTO administradorDTO) {
		if (administradorDTO == null) {
			return new MensajeDTO("Un administrador es requerido", false);
		}
		try {
			IAdministradorMapper administradorMapper = (IAdministradorMapper) getMapperFactory()
					.getMapper(MapperType.ADMINISTRADOR_MAPPER);
			Administrador administrador = administradorMapper
					.fromAdministradorDTOToAdministrador(administradorDTO);
			administradorService.update(administrador);
			return new MensajeDTO("Administrador modificado correctamente",
					true);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
			return new MensajeDTO(new StringBuffer(
					"No se ha podido actualizar el administrador ")
					.append(administradorDTO.getEmail())
					.append(" en base de datos.").toString(), false);
		}
	}

}
