package com.hasl.tracket.controller.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component("recordarLoginFilter")
public class RecordarLoginFilter extends OncePerRequestFilter {

	private static final Log LOG = LogFactory.getLog(RecordarLoginFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String login = request.getParameter("j_username");
		if (login != null && !login.isEmpty()) {
			LOG.debug(new StringBuffer("Login del usuario: ")
					.append(login));
			response.addCookie(new Cookie("SPRING_SECURITY_LAST_USERNAME",
					login));
		}
		filterChain.doFilter(request, response);
	}

}
