package org.ufape.catalogo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.ufape.catalogo.basica.Produto;

@Repository
public interface RepositorioProduto extends JpaRepository<Produto, Long> {
	List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
	List<Produto> findByCategoria_nome(String nome);

}