package Capitulo15;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(new Funcionario("Caiury", "programador", 87444, 3.500));
		funcionarios.add(new Funcionario("Gabriel", "analista", 97344, 3.500));
		funcionarios.add(new Funcionario("Ricardo", "redes", 47764, 3.500));
		funcionarios.add(new Funcionario("Marcella", "programador", 44764, 3.500));
		funcionarios.add(new Funcionario("Diego", "analista", 64728, 3.500));
		funcionarios.add(new Funcionario("Gustavo", "redes", 93534, 3.500));
		funcionarios.add(new Funcionario("Guilherme", "suporte", 24637, 3.500));
		funcionarios.add(new Funcionario("Henrique", "analista", 43627, 3.500));
		funcionarios.add(new Funcionario("Otavio", "suporte", 64534, 3.500));
		funcionarios.add(new Funcionario("Anna", "programador", 97534, 3.500));
		funcionarios.stream().sorted().forEach(System.out::println);
	}

}