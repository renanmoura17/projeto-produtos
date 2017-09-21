package br.com.renan.model.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.jpa.provider.HibernateUtils;

@Entity
public class Usuario {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@NotEmpty
	@Column(unique = true)
	private String nomeUsuario;

	@NotNull
	@NotEmpty
	private String senha;

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
