package Capitulo06;

public class Aluno {
	 private String nome;
	 
	 static int contadorDeAlunos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   


	public void imprimeAluno() {
       System.out.println("Aluno: "+ getNome());
      System.out.println("Contagem no objeto "+getNome()+": "+contadorDeAlunos);
	}

}
