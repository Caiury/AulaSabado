package Capitulo16;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteGravacaoPattern {

	public static void gravarArquivo(String texto) throws Exception {
		OutputStream out = new FileOutputStream("arquivoPattern.txt");
		OutputStreamWriter writer = new OutputStreamWriter(out);
		BufferedWriter buffer = new BufferedWriter(writer);

		buffer.write(texto);
		buffer.flush();
		buffer.close();
  System.out.println("Arquivo Gravado com Sucesso :");
	}

	public static void leArquivo() throws Exception {
     InputStream in = new FileInputStream ("arquivoPattern.txt");
	 InputStreamReader reader = new InputStreamReader(in);	
		BufferedReader buf = new BufferedReader (reader);
		String linha = buf.readLine();
		while (linha != null) {
			System.out.println(linha);
			linha = buf.readLine();
		}
		buf.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite oq deseja gravar:");
		String texto = sc.nextLine();

		try {
			TesteGravacaoPattern.gravarArquivo(texto);
			TesteGravacaoPattern.leArquivo();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Ocorreu um erro: "+e.getMessage());
		}

	}

}
