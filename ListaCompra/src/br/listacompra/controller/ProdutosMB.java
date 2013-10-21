package br.listacompra.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.listacompra.dao.ProdutosDao;
import br.listacompra.model.Produto;

@ManagedBean
public class ProdutosMB {

	@EJB
	ProdutosDao produtosDao;

	private Produto produto = new Produto();

	public void save() {
		produtosDao.save(produto);
		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

}
