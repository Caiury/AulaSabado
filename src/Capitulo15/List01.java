package Capitulo15;

import java.util.ArrayList;
import java.util.List;

import org.junit.platform.engine.support.descriptor.FileSystemSource;

public class List01 {

	public static void main(String[] args) {

		ArrayList<String> listaAlunos = new ArrayList<String>();

		listaAlunos.add("Caiury");
		listaAlunos.add("Henry");
		listaAlunos.add(1, "Claudio"); // metodo que além de adicionar define a posição que o valor deve ficar
		listaAlunos.add("Renan");
		listaAlunos.add("Shalton");

		System.out.println("Tamanho :" + listaAlunos.size()); // metodo para vê o tamanho do array
		System.out.println("Primeiro item da lista: " + listaAlunos.get(0));// metodo para percorrer o primeiro indice
		System.out.println("Ultimo indice: "+listaAlunos.get(listaAlunos.size()-1));// metodo para percorrer o ultimo indice
		
	
		
		listaAlunos.forEach(item->System.out.println(item));// usando expresssao lambda para mostrar os valres do array
		
		
		listaAlunos.add(0, "Eduardo");
		System.out.println("-------------------------");
		
		listaAlunos.forEach(System.out::println);  
		System.out.println(listaAlunos.contains("Eduardo"));  // usando um metodo para saber se existe o objeto na lista
		listaAlunos.removeIf(e-> e.equals("Eduardo")); // metodo que remove o objeto do indice
		listaAlunos.forEach(System.out::println);  
		
		listaAlunos.clear();// metodo para limpar a lista

		System.out.println("A lista esta vazia ?: "+listaAlunos.isEmpty()); // metodo para vê se a lista está vazia
		
		
		
	
		
		}

}
