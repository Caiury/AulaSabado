package cap5lab;

public class Cap5_lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Funcionario f1 = new Funcionario();
     
     f1.setNome("Caiury");
     f1.setSobrenome("Henrique");
     f1.setCargo("Dev Junior");
     f1.setSalario(4000);
     
     
     System.out.println("Nome: "+f1.getNome());
     System.out.println("Sobrenome: "+f1.getSobrenome());
     System.out.println("Cargo: "+f1.getCargo());
     System.out.println("Salario : "+f1.getSalario());
	}

}
