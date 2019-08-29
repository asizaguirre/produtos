package com.produtos.cadastro.domain;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated product ID")
	private Integer id;
	@Version
	@ApiModelProperty(notes = "The auto-generated version of the product")
	private Integer version;
	@ApiModelProperty(notes = "preco", required = true)
	private BigDecimal preco;
	// private String productId;
	@ApiModelProperty(notes = "quantidade")
	private Long quantidade;
	@ApiModelProperty(notes = "foto product")
	private String foto;
	@ApiModelProperty(notes = "Categoy ID", required = true)
	@Column(name = "idCategorias")
	private Integer idCategorias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Integer getIdCategorias() {
		return idCategorias;
	}

	public void setIdCategorias(Integer idCategorias) {
		this.idCategorias = idCategorias;
	}

}
