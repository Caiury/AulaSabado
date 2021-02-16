package Capitulo15;

import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> listaAlunos01 = new TreeSet<>();
		
    listaAlunos01.add("Caiury");
    listaAlunos01.add("Claudio");
    listaAlunos01.add("Shalton");
    listaAlunos01.add("Anna");
    listaAlunos01.add("Jõao");
        
    System.out.println("Quantidade de itens no conjuntos: "+listaAlunos01.size());
    listaAlunos01.forEach(e->System.out.println(e));
    
    Set<Integer> megaSena = new TreeSet<>();
    
    for (int  i =0;i<6;i++) {
    	megaSena.add((int) ((int) 1+(Math.random()*60)));
    
    }
    megaSena.forEach(item-> System.out.println(item));
    
    System.out.println(megaSena);
  
    double array []= new double[2];
    
    for(int i=0;i<array.length;i++) {
    	array[i]=1+ Math.random()*60;
    	
    	System.out.println(array[i]);
    }
    
    System.out.println(listaAlunos01.contains("Caiury"));
    
	}

}
