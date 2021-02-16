package Desafios;

public class MegaSena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] megaSena = new int[6];
		int sorteado = 0;
//atribuindo valores a variavel megaSena
		for (int i = 0; i < megaSena.length; i++) {
			sorteado = (int) (1 + Math.random() * 60);
			megaSena[i] = sorteado;

// modo opcional para a atribuiçao		megaSena[i] = (int) (1 + Math.random() * 60); 
		}
		
		
		
// implementando a logica que não deixa os numeros duplicarem
		for (int i = 0; i < megaSena.length; i++) {
			for (int j = i + 1; j < megaSena.length; j++) {

				if (megaSena[i] == megaSena[j]) {
					i = -1;
					break;
				}
			}
		}
		
		
		// logica para os numeros ficarem em ordem crescente
		for (int i = 0; i < megaSena.length; i++) {
			for (int j = i + 1; j < megaSena.length; j++) {

				if (megaSena[i] > megaSena[j]) {
					int aux = megaSena[i];
					megaSena[i] = megaSena[j];
					megaSena[j] = aux;
				}
			}
		}
		
		
// uso do for each
		for (int n : megaSena) {
			System.out.print(n + " ");
		}

	}

}
