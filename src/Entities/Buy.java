package Entities;

import Entities.enums.Dishes;
import java.util.ArrayList;
import java.util.List;


public class Buy {
	
	private String fornecedor;
	private Dishes pratos;
	private Integer quantidade;
	private Double valor;
	
	 List<Buy> listBuy = new ArrayList<Buy>();

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
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void getListBuy(Buy item) {
		listBuy.add(item);
	}
	
	public void removeListBuy(Buy item) {
		listBuy.remove(item);
	}

	
	public String ToString() {
		StringBuilder sb = new StringBuilder();
		for(Buy list: listBuy) {
			sb.append("Fornecedor: " + list.getFornecedor() +
				", Pratos : " + list.getPratos() + 
				", Qtd:  " + list.getQuantidade() + 
				", Valor: " + list.getValor() + "\n");
		}
		
		return sb.toString();
		/*return "Fornecedor: " + fornecedor +
				", Pratos : " + pratos + 
				", Qtd:  " + quantidade + 
				", Valor: " + valor;*/
	}

	
	
	
	
	

}
