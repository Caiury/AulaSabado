package Capitulo15;

import java.util.HashMap;



public class Cap15_Labo1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		HashMap <String,Integer>pessoa = new HashMap<String, Integer> ();
		
		pessoa.put("Roberto", 35);
		pessoa.put("Carla", 26);
		pessoa.put("Gabriel", 18);
		pessoa.put("Bruna",17);
		
		System.out.println("Pessoas");
		pessoa.forEach((k,v)->System.out.println(k+" :"+v));
 

	}

}
