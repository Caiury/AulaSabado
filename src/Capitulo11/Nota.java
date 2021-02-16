package Capitulo11;

public class Nota {

	private String nome;
	private int nota;

	public Nota() {
		super();
	}

	public Nota(String nome, int nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) throws NotaInvalidaException {
	if (nota>=0 && nota<=10) {
		this.nota = nota;
		System.out.println("Colocou a nota");
	}else   {
	
	throw new NotaInvalidaException();
	}
	}
   
	
	
}
