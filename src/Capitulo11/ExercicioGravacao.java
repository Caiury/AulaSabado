package Capitulo11;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintWriter writer = null;

		try {
			System.out.println("Digite uma frase");
			String texto = sc.nextLine();
			
			writer = new PrintWriter("arquivos_testes.txt");
			writer.println(texto);
			writer.close();
			System.out.println("Arquivo gravado com sucesso");

		} catch (IOException e) {
			System.out.println("Falha ao gravar as informações digitadas");
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		
		}

	}

}
