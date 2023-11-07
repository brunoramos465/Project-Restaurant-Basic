package Application;

import Entities.Buy;
import Entities.enums.Dishes;

public class Program {
	 
	public static void main(String[] args) {
		Buy buy = new Buy("ATACADÃO", Dishes.PRATO_PRINCIPAL, 10, 50.00);
		
		System.out.print(buy.ToString());

	}
	
	
	

}
