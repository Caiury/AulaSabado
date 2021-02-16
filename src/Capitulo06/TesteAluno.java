package Capitulo06;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno joao = new Aluno();
		Aluno maria = new Aluno();
		Aluno marcos = new Aluno();

		joao.setNome("João");
		joao.contadorDeAlunos ++;
		joao.imprimeAluno();
		System.out.println("                   ");
		
		maria.setNome("Maria");
		maria.contadorDeAlunos ++;
		maria.imprimeAluno();
		System.out.println("                   ");
		
		marcos.setNome("Marcos");
		marcos.contadorDeAlunos  ++;
		marcos.imprimeAluno();
		System.out.println("                   ");
		
		System.out.println("Contador acessado diretamente da classe:" + Aluno.contadorDeAlunos);

	}

}
