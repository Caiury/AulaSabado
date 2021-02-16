package Capitulo04;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int x = 1930; x <= 2018; x += 4) {
			if (x==1942 || x==1946) {
				System.out.println(x+": Esse ano não teve copa");
				continue;
			
			}
			System.out.println(x+": Ano de Copa");
		}

	}

}
