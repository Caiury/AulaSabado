package Capitulo15;

public class CarroApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Carro c1 = new Carro ("Mercedez GLA200","DGG1504");
     Carro c2= new Carro ("Mercedez GLA200","DGG1504");
    
  System.out.println(c1.equals(c2));   
  
  System.out.println(c1.hashCode());
  System.out.println(c2.hashCode());
	}

}
