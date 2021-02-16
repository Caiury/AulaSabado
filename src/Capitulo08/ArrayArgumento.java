package Capitulo08;

import java.util.Scanner;

public class ArrayArgumento {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa iniciando");

		if (args.length > 0) {
			if (args[0].equals("drive")) {
				System.out.println("iniciando o jogo de corrida");
			} else if (args[0].equals("puzzle")) {
				System.out.println("iniciando o jogo de quebra cabeça");
			} else if (args[0].equals("arcade")) {
				System.out.println("iniciando o jogo de luta");
			} else {
				System.out.println("argumento invalido");
			}

		}
		System.out.println("Programa finalizando");
		sc.close();
	}
}
