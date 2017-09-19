package br.com.renan.configuracoes;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories (basePackages = "br.com.renan.model.repositorios")
public class ConfiguracaoBD {
	
	//Configuração do banco de dados
	@Bean
	public DataSource dataSource() throws IllegalStateException, PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/americanas");
		dataSource.setUser("root");
		dataSource.setPassword("root");
		
		return dataSource;
	}
	
	//Criação do Entity Manager, para uso do Hibernate
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory () throws Exception {
		LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactory.setDataSource(dataSource());
		entityManagerFactory.setPackagesToScan("br.com.renan.model.entidades");
		entityManagerFactory.setPersistenceProviderClass(HibernatePersistenceProvider.class);
		entityManagerFactory.setJpaDialect(new HibernateJpaDialect());
		
		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		jpaProperties.put("hibernate.hbm2ddl.auto", "create");
		
		entityManagerFactory.setJpaProperties(jpaProperties);
		
		return entityManagerFactory;
	}
	
	//Gerencia as transações do Hibernate
	@Bean
	public JpaTransactionManager transactionManager() throws Exception {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
		return transactionManager;
	}
		

}
