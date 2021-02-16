package Capitulo16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TesteLeituraSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream in = new FileInputStream("GravarArquivo.txt");
			DataInputStream dados = new DataInputStream (in);
			
			while (in.available() > 0) {
				char letras = dados.readChar();
				System.out.println(letras);
			}

		
		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo : " + e.getMessage());
		}
	}

}
