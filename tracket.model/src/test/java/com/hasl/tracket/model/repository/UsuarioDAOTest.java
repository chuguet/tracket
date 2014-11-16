package com.hasl.tracket.model.repository;

import java.sql.SQLException;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import com.hasl.tracket.model.entity.Usuario;

@Transactional
public class UsuarioDAOTest extends AbstractTest {

	@Inject
	private IUsuarioDAO usuarioDAO;

	@Test
	public void testSave() throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setApellidos("Huguet");
		usuarioDAO.save(usuario);
	}

}
