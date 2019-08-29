package com.produtos.cadastro.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated cliente ID")
	private Integer idCliente;
	@ApiModelProperty(notes = "nome", required = true)
	private String nome;
	@ApiModelProperty(notes = "email", required = true)
	private String email;
	@ApiModelProperty(notes = "senha", required = true)
	private String senha;
	@ApiModelProperty(notes = "rua", required = true)
	private String rua;
	@ApiModelProperty(notes = "cidade", required = true)
	private String cidade;
	@ApiModelProperty(notes = "bairro", required = true)
	private String bairro;
	@ApiModelProperty(notes = "cep", required = true)
	private String cep;
	@ApiModelProperty(notes = "estado", required = true)
	private String estado;
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
