package Capitulo16;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import Capitulo14.OperacaoAritimetica;

public class TesteGravacaoSimples {

	public static void main(String[] args) {

		try {
			OutputStream out = new FileOutputStream("GravarArquivo.txt");
			DataOutputStream data = new DataOutputStream(out);
			data.writeChars("Java Programmer");
			data.flush();
			data.close();

			// out.write(74);
			// out.write(65);
			// out.write(86);
			// out.write(65);
			// out.flush();
			System.out.println("Arquivo gravado com sucesso");
			// out.close();

		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao gravar: " + e.getMessage());

		}
		
		
	}
}