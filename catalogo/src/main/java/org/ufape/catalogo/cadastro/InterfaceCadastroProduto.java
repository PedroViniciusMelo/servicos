package org.ufape.catalogo.cadastro;

import org.ufape.catalogo.basica.Produto;

import java.util.List;


public interface InterfaceCadastroProduto {

	List<Produto> listarProdutos(String descricao);

	List<Produto> listarProdutosPorCategoria(String nome);

	Produto salvarProduto(Produto entity);

	List<Produto> listarProdutos();

	Produto encontrarProdutoId(Long id);

	void apagarProduto(Long id);

	Produto atualizarProduto(Long id, Produto entity);
}