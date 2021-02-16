package Capitulo08;



public class Cap8_Lab1 {

	public static int maiorNumero(int[] array) {
		int maior = 0;
		for (int i = 0; i < array.length; i++) {
			
				if (array[i]>maior) {
					maior = +array[i];
				}

			
		}

		return maior;
	}
		 public static void main (String []args) {
			 
			int []array = {44545,5777,58474877,7554};
			
		Cap8_Lab1.maiorNumero(array);
		
		System.out.println("O maior numero do array é :"+maiorNumero(array));
			 
		 }
		

	
}