package br.listacompra.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.type.BlobType;

@Entity
public class ImgProduto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BlobType img;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BlobType getImg() {
		return img;
	}

	public void setImg(BlobType img) {
		this.img = img;
	}
}
