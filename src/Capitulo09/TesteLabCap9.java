package Capitulo09;

public class TesteLabCap9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno p = new Aluno("Manoel", 24, 'M', 1099.0f, "Ciencia da computação", "01/06/1995", 521234567);
		Pessoa p2 = new Aluno("Claudia", 25, 'F', 7990f, "Medicina", "01/06/1995", 415678912);
		Pessoa p3 = new Professor("Rafael", 38, 'M', 2500.0f, "Portugués", "05/02/1974", 261454789);

		
		
		p3.falar(":Manoel? ");
		p.falar(":Presente");
		p3.falar(":Claudia:");
		p2.falar(":Presente");
		
		
		p3.mostrarDados();
		System.out.println();
		
		p.mostrarDados();
		System.out.println();
		
		p2.mostrarDados();
	}

}
