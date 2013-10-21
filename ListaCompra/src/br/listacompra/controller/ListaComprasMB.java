package br.listacompra.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.listacompra.dao.ListaComprasDao;
import br.listacompra.model.ListaCompras;

@ManagedBean
public class ListaComprasMB {

	@EJB
	ListaComprasDao listaDao;

	private ListaCompras lista = new ListaCompras();

	public void save() {
		lista = listaDao.save(lista);
	}

	public ListaCompras getLista() {
		return lista;
	}

	public void setLista(ListaCompras lista) {
		this.lista = lista;
	}

	public void novo() {
		lista = new ListaCompras();
	}
}
