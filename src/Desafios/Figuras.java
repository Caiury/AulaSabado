package Desafios;

public class Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] quadrado = new String[5][5];

	
      System.out.println("QUADRADO 5 X5");
		for (int i = 0; i < quadrado.length; i++) {
		 for (int x = 0; x < quadrado[i].length; x++) {
           quadrado[i][x]="*";
		 System.out.print(quadrado[i][x] + " ");

		 }
		 System.out.println();
		 }
		System.out.println();

		
		
		String[][] retangulo = new String[5][9];
	
           System.out.println("RETANGULO 5X9");
		for (int linha = 0; linha < retangulo.length; linha++) {
			for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
				if (coluna ==0 || linha ==0 || coluna ==8 || linha ==4)  {
				retangulo[linha][coluna]="*";
				}else {
					retangulo[linha][coluna] =" ";
				}
				System.out.print(retangulo[linha][coluna]+" ");
			
		
			}
System.out.println();
		
		}
		
		System.out.println();
		
		String [][]  triangulo = new String [5][9];
		int meio =triangulo[0].length/2;
		  System.out.println("Triangulo 5X9");
			for (int linha = 0; linha < triangulo.length; linha++) {
				for (int coluna = 0; coluna < triangulo[linha].length; coluna++) {
					if(coluna>= (meio-linha)&& coluna<=(meio+linha)) {
						triangulo[linha][coluna]="*";
					}
					else {
						triangulo[linha][coluna] = " ";
					}
					System.out.print(triangulo[linha][coluna]+" ");
				}
				System.out.println();
			}
		
				}
	}

