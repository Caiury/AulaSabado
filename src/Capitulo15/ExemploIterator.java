package Capitulo15;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class ExemploIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<String > alunos = new HashSet<>();
     
     alunos.add("Caiury");
     alunos.add("Shalton");
     alunos.add("Claudio");
     alunos.add("João");
     
      Iterator<String> it= alunos.iterator();
      System.out.println(it.hasNext());
	}

}
