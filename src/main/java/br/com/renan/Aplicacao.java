package br.com.renan;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Aplicacao implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//Criacao do contexto da aplicacao
		AnnotationConfigWebApplicationContext applicationContext = buildApplicationContext();
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(applicationContext));
		appServlet.setLoadOnStartup(1);
		
		//URLs que serao mapeadas pelo contexto
		appServlet.addMapping("/app/*");
		
		servletContext.addListener(new ContextLoaderListener(applicationContext));
	}
	
	private AnnotationConfigWebApplicationContext buildApplicationContext() {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("br.com.renan.configuracoes");
		return webApplicationContext;
	}

}
