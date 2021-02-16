package Capitulo15;

import java.util.ArrayList;
import java.util.Collections;

public class AlunoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		alunos.add(new Aluno("Caiury", 25, 47446));
		alunos.add(new Aluno("Andre", 19, 9987446));
		alunos.add(new Aluno("Luis", 35, 8227446));
		alunos.add(new Aluno("Gustavo", 44, 111446));
		alunos.add(new Aluno("Marcelo", 27, 2334346));
		alunos.add(new Aluno("Luis", 21, 55347446));

		System.out.println("Usando compareToo");
		alunos.stream().limit(5)
		.sorted()
		.forEach(System.out::println);

		System.out.println("Usando compare");
		AlunoFiltro a = new AlunoFiltro();
		Collections.sort(alunos, a);
		alunos.forEach(System.out::println);
	}

}
