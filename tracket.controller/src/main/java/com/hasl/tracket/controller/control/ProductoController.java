package com.hasl.tracket.controller.control;

import java.util.ArrayList;
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
import com.hasl.tracket.controller.dto.ProductoDTO;
import com.hasl.tracket.controller.dto.UsuarioDTO;
import com.hasl.tracket.controller.dto.mapper.IProductoMapper;
import com.hasl.tracket.controller.dto.mapper.IUsuarioMapper;
import com.hasl.tracket.controller.dto.mapper.factory.IMapperFactory;
import com.hasl.tracket.controller.dto.mapper.factory.MapperType;
import com.hasl.tracket.model.entity.Producto;
import com.hasl.tracket.model.entity.Usuario;
import com.hasl.tracket.model.exception.DatabaseInsertException;
import com.hasl.tracket.model.exception.DatabaseRetrieveException;
import com.hasl.tracket.model.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController extends AbstractController {

	/** The Constant LOG. */
	private final static Log LOG = LogFactory.getLog(UsuarioController.class);

	@Inject
	private IProductoService productoService;

	@RequestMapping(value = "/form/{operacion}", method = RequestMethod.GET, produces = "text/html")
	public String createForm(@PathVariable("operacion") String operacion,
			final Model uiModel) {
		uiModel.addAttribute("operacion", operacion);
		if (!operacion.equals("list")) {
			operacion = "form";
		}
		return new StringBuffer("usuario/").append(operacion).toString();
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody MensajeDTO insert(@RequestBody ProductoDTO productoDTO) {
		MensajeDTO mensajeDTO = null;

		IProductoMapper productoMapper = (IProductoMapper) getMapperFactory()
				.getMapper(MapperType.PRODUCTO_MAPPER);

		Producto producto = productoMapper
				.fromProductoDTOToProducto(productoDTO);

		try {
			this.productoService.save(producto);
		} catch (DatabaseInsertException e) {
			LOG.error(e.getMessage());
		}

		return mensajeDTO;
	}

	/**
	 * List all users.
	 * 
	 * @return the list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<ProductoDTO> listAll() {
		List<ProductoDTO> listProductoDTO = new ArrayList<ProductoDTO>();

		IProductoMapper productoMapper = (IProductoMapper) getMapperFactory()
				.getMapper(MapperType.PRODUCTO_MAPPER);
		try {
			List<Producto> listProducto = this.productoService.findAll();
			listProductoDTO = productoMapper
					.fromProductoListToProductoDTOList(listProducto);
		} catch (DatabaseRetrieveException e) {
			LOG.error(e.getMessage());
		}
		return listProductoDTO;
	}

	/**
	 * Removes the user by id.
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
		/*
		 * if (id == null) { return new MensajeDTO("Un usuario es requerido",
		 * false); } try { Usuario usuario = new Usuario(); usuario.setId(id);
		 * this.usuarioService.delete(usuario); return new
		 * MensajeDTO("Usuario eliminado correctamente", true); } catch
		 * (DatabaseDeleteException e) { LOG.error(e.getMessage()); return new
		 * MensajeDTO("El usuario no ha podido ser borrado", false); }
		 */
		return null;
	}

	/**
	 * Retrieve one User.
	 * 
	 * @param id
	 *            the id
	 * @return the usuario dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody UsuarioDTO retrieve(@PathVariable("id") Integer id) {
		/*
		 * UsuarioDTO usuarioDTO = new UsuarioDTO(); try { Usuario usuario =
		 * this.usuarioService.findOne(id); usuarioDTO =
		 * usuarioMapper.toRest(usuario); } catch (DatabaseRetrieveException e)
		 * { LOG.error(e.getMessage()); } return usuarioDTO;
		 */
		return null;
	}

	/**
	 * Update the user.
	 * 
	 * @param usuarioDTO
	 *            the usuario dto
	 * @return the mensaje dto
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public @ResponseBody MensajeDTO update(@RequestBody UsuarioDTO usuarioDTO) {
		/*
		 * if (usuarioDTO == null) { return new
		 * MensajeDTO("Un usuario es requerido", false); } try { Usuario usuario
		 * = usuarioMapper.toBusiness(usuarioDTO);
		 * usuarioService.update(usuario); return new
		 * MensajeDTO("Usuario modificado correctamente", true); } catch
		 * (DatabaseInsertException e) { LOG.error(e.getMessage()); return new
		 * MensajeDTO(new StringBuffer(
		 * "No se ha podido actualizar el usuario ")
		 * .append(usuarioDTO.getUser()).append(" en base de datos.")
		 * .toString(), false); }
		 */
		return null;
	}
}
