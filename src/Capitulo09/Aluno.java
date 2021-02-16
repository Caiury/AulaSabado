package Capitulo09;

public class Aluno extends Pessoa {

	private float mensalidade;
	private String curso;
	
	



	public Aluno(String nome, int idade, char sexo,  float mensalidade, String curso, String dataNasc, int numero) {
		super(nome, idade, sexo, new RG (numero,dataNasc));
		this.mensalidade = mensalidade;
		this.curso = curso;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void falar(String fala) {
		// TODO Auto-generated method stub
		System.out.println(getNome()+fala);
	}

	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		System.out.println(getMensalidade());
		System.out.println(getCurso());
		System.out.println(getNome());
		System.out.println(getIdade());
		System.out.println(getSexo());
		System.out.println(getRg().getNumero());
	    System.out.println(getRg().getDataNasc());
	}

}
