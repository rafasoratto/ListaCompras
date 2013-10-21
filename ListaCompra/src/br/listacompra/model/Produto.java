package br.listacompra.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String nome;

	private Double valor;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, optional = true)
	@PrimaryKeyJoinColumn
	private ImgProduto imgProduto;

	public ImgProduto getImgProduto() {
		if (imgProduto == null) {
			imgProduto = new ImgProduto();
		}
		return imgProduto;
	}

	public void setImgProduto(ImgProduto imgProduto) {
		this.imgProduto = imgProduto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
