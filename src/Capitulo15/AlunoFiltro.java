package Capitulo15;

import java.util.Comparator;

public class AlunoFiltro implements Comparator<Aluno>{

	@Override
	public int compare(Aluno o1, Aluno o2) {
		if ( o1.getMatricula()>o2.getMatricula()) {
			return 1;
		}
		if (o1.getMatricula()<o2.getMatricula()) {
			return -1;
		}
		return 0;
	}

}
