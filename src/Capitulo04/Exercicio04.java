package Capitulo04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	 java.util.Scanner sc = new Scanner (System.in);
		
int numero=sc.nextInt();
		int divisores=0;
		
		 for (int x=1;x<=numero;x++) {
			 if(numero%x==0) {
				divisores++;
			 }else if(divisores >2) {
				
			 }else if (divisores==2) {
				
				 
			 }
			
		 }
		 System.out.println(divisores ==2?"primo":"não primo");
		 sc.close();
	}

	
	
}

