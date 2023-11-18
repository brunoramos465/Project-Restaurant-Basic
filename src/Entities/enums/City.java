package Entities.enums;

public enum City {
	
	BELO_HORIZONTE(3.00),
	CONTAGEM(3.00),
	BETIM(3.00),
	RIBEIRAO_DAS_NEVES(3.00),
	ESMERALDAS(4.00),
	SANTA_LUZIA(4.00),
	SABARA(4.00),
	NOVA_LIMA(4.00),
	IBIRITE(5.00);
	
	private Double valor;
	
	City(Double valor){
		this.valor = valor;
	}
	
	public Double getValor() {
		return valor;
	}
	
}
