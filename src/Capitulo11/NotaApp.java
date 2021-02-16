package Capitulo11;

public class NotaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nota n = new Nota ();
		
		n.setNome("CAIURY");  
		try {
		n.setNota(-1);
		}catch(Exception e) {
			System.out.println("Erro: "+ e.getMessage());
			System.out.println("Causa: "+ e.getCause());
		}
		
		
		
	}

}
