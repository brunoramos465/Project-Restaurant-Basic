package Application;

import Entities.Buy;
import Entities.enums.Dishes;

public class Program {
	 
	public static void main(String[] args) {
		
		Buy buy = new Buy();
		
		Buy Compra1 = new Buy("ATACADÃO",Dishes.PRATO_PRINCIPAL,10,50.00);
		Buy Compra2 = new Buy("VENDA",Dishes.PRATO_PRINCIPAL,20,80.00);
		Buy Compra3 = new Buy("opções",Dishes.PRATO_PRINCIPAL,40,00.00);

		buy.getListBuy(Compra1);
		buy.getListBuy(Compra2);
		buy.getListBuy(Compra3);

		System.out.print(buy.ToString());
		


	}
	
	
	

}
