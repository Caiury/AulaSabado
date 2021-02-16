package Capitulo07;

public class TesteCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cadastro c1 = new Cadastro ();
      Cadastro c2 = new Cadastro ("Caiury","Henrique");
      Cadastro c3 = new Cadastro ("Caiury","Henrique",25);
      
      c1.mostrar();
      c2.mostrar();
      c3.mostrar();
	}

}
