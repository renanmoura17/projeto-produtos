package br.com.renan.model.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.renan.model.entidades.Produto;

@Repository
public interface ProdutoRepositorio extends CrudRepository<Produto, Long>{

}
