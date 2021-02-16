package Capitulo09;

public class Professor extends Pessoa {


	private float salario;
	private String disciplina;

	
	
	
	public Professor(String nome, int idade, char sexo,  float salario, String disciplina, String dataNasc, int numero) {
		super(nome, idade, sexo,  new RG (numero,dataNasc));
		this.salario = salario;
		this.disciplina = disciplina;
	}



	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}



	@Override
	public void falar(String fala) {
		// TODO Auto-generated method stub
		System.out.println(getNome()+fala);
	}



	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		System.out.println(getSalario());
		System.out.println(getDisciplina());
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(getRg().getNumero());
		System.out.println(getRg().getDataNasc());
	
	}

}
