package com.produtos.cadastro.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated categoria ID")
    private Integer idCategorias;
    @ApiModelProperty(notes = "Categoria description")
    private String categoria;
	public Integer getIdCategorias() {
		return idCategorias;
	}
	public void setIdCategorias(Integer idCategorias) {
		this.idCategorias = idCategorias;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
    
    
}
