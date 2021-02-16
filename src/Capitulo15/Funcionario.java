package Capitulo15;


public class Funcionario implements Comparable <Funcionario>{
	private String nome;
	private String cargo;
	private int matricula;
	private double salario;

	
	public Funcionario(String nome, String cargo, int matricula, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.matricula = matricula;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", matricula=" + matricula + ", salario=" + salario
				+ "]";
	}

	@Override
	public int compareTo(Funcionario o) {
		// TODO Auto-generated method stub
		if (this.matricula>o.matricula) {
			return 1;
		}
		if (matricula<o.matricula) {
			return -1;
		}
		return 0;
	}
   
	
}
