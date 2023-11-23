package Entities.enums;

public enum Dishes {
	
	PRATO_PRINCIPAL(25.00),
	PRATO_SECUNDARIO(15.00);
	
private Double valor;
	
	Dishes(Double valor){
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}

}
