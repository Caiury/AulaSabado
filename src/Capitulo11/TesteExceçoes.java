package Capitulo11;

import java.util.Scanner;

public class TesteExceçoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um numero");
			int n1 = sc.nextInt();
			System.out.println("Digite um segundo numero");
			int n2 = sc.nextInt();
			System.out.println("Resultado é :"+n1/n2);
		} catch (java.lang.ArithmeticException e) {
			System.out.println("Não é possivel dividir o numero por zero");
		}
        sc.close();
	}

}
