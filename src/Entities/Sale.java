package Entities;

import Entities.enums.City;
import Entities.enums.Dishes;

public class Sale extends Stock{
	
	private String nome;
	private String endereco;
	private City frete;
	private Dishes pratos;
	
	public Sale() {
		
	}
	
	public Sale(String nome, String endereco, City frete, Dishes pratos) {
		this.nome = nome;
		this.endereco = endereco;
		this.frete = frete;
		this.pratos = pratos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public City getFrete() {
		return frete;
	}

	public Dishes getPratos() {
		return pratos;
	}


	public void setPratos(Dishes pratos) {
		this.pratos = pratos;
	}

	public Double totalFrete() {
		return getFrete().getValor();
	}
	
	public Double totalPratos() {
		return getPratos().getValor();
	}
	
	public Double total() {
		return totalPratos() + totalFrete();
	}
	
	@Override
	public String toString() {
		return  "Prato: " + getPratos() + "\n"+
				"Frete: " + totalFrete() + "\n" +
				"TOTAL: " + total();	
	}
	
	


	
	
	
	
	
	
	

}
