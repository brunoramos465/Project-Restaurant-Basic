package Application;

import Entities.Stock;
import Entities.enums.Dishes;
import Entities.enums.City;
import Entities.Sale;

public class Program {
	 
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		
		Stock fornecedor1 = new Stock("ATACADÃO",Dishes.PRATO_PRINCIPAL,10,50.00);
		Stock fornecedor2 = new Stock("VENDA",Dishes.PRATO_PRINCIPAL,20,80.00);
		Stock fornecedor3 = new Stock("opções",Dishes.PRATO_PRINCIPAL,40,00.00);

		stock.getListBuy(fornecedor1);
		stock.getListBuy(fornecedor2);
		stock.getListBuy(fornecedor3);
		
		
		System.out.print(stock.ToString());
		System.out.print(City.BELO_HORIZONTE.getValor());
		
		Sale sale = new Sale();
		
		Sale cliente1 = new Sale("Bruno", "Rua A", City.CONTAGEM, Dishes.PRATO_PRINCIPAL);

		System.out.println(cliente1);

	}
	
	
	

}
