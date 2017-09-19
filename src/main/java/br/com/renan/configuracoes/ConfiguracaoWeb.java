package br.com.renan.configuracoes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan( basePackages="br.com.renan" ) //Identifica quais objetos deverm ser configurados pelo ConfiguracaoWeb
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter{
		
}
