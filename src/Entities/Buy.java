package Entities;

import Entities.enums.Dishes;

public class Buy {
	
	private String fornecedor;
	private Dishes pratos;
	private Integer quantidade;
	private Double valor;
	
	public Buy() {
		
	}
	
	public Buy(String fornecedor, Dishes pratos, Integer quantidade, Double valor) {
		this.fornecedor = fornecedor;
		this.pratos = pratos;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public String getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public Dishes getPratos() {
		return pratos;
	}
	
	public void setPratos(Dishes pratos) {
		this.pratos = pratos;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getvalor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String ToString() {
		return "Fornecedor: " + fornecedor +
				", Pratos : " + pratos + 
				", Qtd:  " + quantidade + 
				", Valor: " + valor;
	}
	

}
