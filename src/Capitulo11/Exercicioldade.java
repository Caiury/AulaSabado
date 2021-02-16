package Capitulo11;

import java.util.Scanner;
import java.util.Calendar;

public class Exercicioldade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendario = Calendar.getInstance();
		try {
			System.out.println("Digite ano do seu nascimento ");
			String ano = sc.nextLine();
			int atribuicao = Integer.parseInt(ano);
			System.out.println("Sua idade é: " + (calendario.get(Calendar.YEAR) - atribuicao));
		} catch (NumberFormatException e) {
			System.out.println("Valor Digitado invalido");
		}finally   {
			sc.close();	
		}
	
	}
}
