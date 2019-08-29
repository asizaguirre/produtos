package com.produtos.cadastro.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class PedidoItens {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The database generated pedidp ID")
	private Integer idItem;
	@ApiModelProperty(notes = "Pedido ID", required = true)
	@Column(name = "idPedido")
	private Integer idPedido;
	@ApiModelProperty(notes = "product ID")
	@Column(name = "id")
	private Integer idProduto;
	@ApiModelProperty(notes = "Produto", required = true)
	private Product produto;
	@ApiModelProperty(notes = "Quantidade", required = true)
	private Integer quantidade;
	@ApiModelProperty(notes = "Valor", required = true)
	private Float valor;
	public Integer getIdItem() {
		return idItem;
	}
	public void setIdItem(Integer idItem) {
		this.idItem = idItem;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Product getProduto() {
		return produto;
	}
	public void setProduto(Product produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	
}
