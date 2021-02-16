package Capitulo03;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bolaVerde = 0;
		int bolaAzul = 0;
		int bolaAmarela = 0;
		int bolaBranca = 0;
		int bolaPreta = 0;
		
		
		while (bolaVerde<5 &&bolaAzul<5&&bolaAmarela<5 && bolaBranca<5&&bolaPreta<5 ){
			System.out.println("Digite um numero de 1 a 5");
			int digito = sc.nextInt();
			if (digito == 1) {
				bolaVerde+=1;
			} else if (digito == 2) {
					bolaAmarela+=1;
				} else if (digito == 3) {
						bolaAzul += 1;
					} else if (digito == 4) {
							bolaBranca += 1;
						} else if (digito==5){
							bolaPreta+=1;
					}else {
						System.out.println("Numero invalido");
					}
			
		
					}
			System.out.println("Bola amarela: "+bolaAmarela);
			System.out.println("Bola Azul: "+ bolaAzul);
			System.out.println("Bola branca: "+ bolaBranca);
			System.out.println("Bola verde: "+ bolaVerde);
			System.out.println("BolaPreta: "+bolaPreta);
          
			
		
		
		sc.close();
	}

}