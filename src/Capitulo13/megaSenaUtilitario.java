package Capitulo13;

import java.util.Random;
public class megaSenaUtilitario {

	public static int sortearNumero() {
		Random random = new Random ();
		int numero = random.nextInt();
		while (numero<=0 || numero >60) {
			 numero = random.nextInt();
		}
		return numero;	
	}
	
}
