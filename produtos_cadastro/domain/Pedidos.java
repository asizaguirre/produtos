package com.produtos.cadastro.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Pedidos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idPedido;
	@ApiModelProperty(notes = "data", required = true)
	private Date data;
	@Column(name = "idCliente")
	@ApiModelProperty(notes = "idCliente", required = true)
	private Integer idCliente;
	@ApiModelProperty(notes = "status", required = true)
	private String status;
	@ApiModelProperty(notes = "sessao", required = true)
	private String sessao;

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSessao() {
		return sessao;
	}

	public void setSessao(String sessao) {
		this.sessao = sessao;
	}

}
