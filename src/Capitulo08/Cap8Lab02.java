package Capitulo08;

public class Cap8Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		if (args.length > 0) {
			int soma = 0;
			String idadeTexto="";
		
				for (int i = 0; i < args.length; i++) {
					soma += Integer.parseInt(args[i]);
					idadeTexto += args[i]+" ";
				}
				double media =soma/args.length;
				System.out.println("a média das idades "+idadeTexto+" é de ="+media);
			}
		}
		

	}
