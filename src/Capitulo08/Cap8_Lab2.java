package Capitulo08;

public class Cap8_Lab2 {

	public static void main(String[] args) {

		int[] idade = { 25, 14, 14, 75 };
		int soma = 0;
		for (int i = 0; i < idade.length; i++) {
			soma += idade[i];
		}
		int media = soma / 4;
		System.out.println("A média das idades somadas é " + media);

		for (int i = 0; i <= 10; i++) { // TABUADA
			for (int y = 0; y <= 10; y++) {
				 System.out.println(i+"x"+y+"="+i*y);
			}

		}
	
	
	}

}

