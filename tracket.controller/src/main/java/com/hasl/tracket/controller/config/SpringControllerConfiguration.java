package com.hasl.tracket.controller.config;

import java.util.Arrays;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.hasl.tracket.model.config.SpringModelConfiguration;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringControllerConfiguration.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.hasl.tracket.controller")
@Import({ SpringModelConfiguration.class })
public class SpringControllerConfiguration extends WebMvcConfigurerAdapter {

	/**
	 * Content negotiation manager factory bean.
	 *
	 * @return the content negotiation manager factory bean
	 */
	@Bean
	public ContentNegotiationManagerFactoryBean contentNegotiationManagerFactoryBean() {
		ContentNegotiationManagerFactoryBean contentNegotiationManager = new ContentNegotiationManagerFactoryBean();
		contentNegotiationManager.addMediaType("json",
				MediaType.APPLICATION_JSON);
		return contentNegotiationManager;
	}

	/**
	 * Content view resolver.
	 *
	 * @param contentNegotiationManagerFactoryBean
	 *            the content negotiation manager factory bean
	 * @param mappingJacksonJsonView
	 *            the mapping jackson json view
	 * @param internalResourceViewResolver
	 *            the internal resource view resolver
	 * @return the content negotiating view resolver
	 * @throws Exception
	 *             the exception
	 */
	@Bean
	@Inject
	public ContentNegotiatingViewResolver contentViewResolver(
			ContentNegotiationManagerFactoryBean contentNegotiationManagerFactoryBean,
			MappingJacksonJsonView mappingJacksonJsonView,
			InternalResourceViewResolver internalResourceViewResolver)
			throws Exception {
		ContentNegotiatingViewResolver contentViewResolver = new ContentNegotiatingViewResolver();
		contentViewResolver
				.setContentNegotiationManager(contentNegotiationManagerFactoryBean
						.getObject());
		contentViewResolver.setViewResolvers(Arrays
				.<ViewResolver> asList(internalResourceViewResolver));
		contentViewResolver.setDefaultViews(Arrays
				.<View> asList(mappingJacksonJsonView));
		return contentViewResolver;
	}

	/**
	 * Internal resource view resolver.
	 *
	 * @return the internal resource view resolver
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

	/**
	 * Mapping jackson json view.
	 *
	 * @return the mapping jackson json view
	 */
	@Bean
	public MappingJacksonJsonView mappingJacksonJsonView() {
		return new MappingJacksonJsonView();
	}
}
