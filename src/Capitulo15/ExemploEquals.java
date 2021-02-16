package Capitulo15;

import java.util.Scanner;

public class ExemploEquals {

 public	static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Digite um texto:");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		String text = sc.nextLine();
		System.out.println(texto.equals(text));
               if (texto.equals(text)==true) {
            	   System.out.println("São o mesmo objeto");
               }else {
            	   System.out.println("Objetos diferentes");
               }
		
		sc.close();
	}

}
