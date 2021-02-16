package Capitulo05;

public class Garagem {

	public Carros carroPasseio = new Carros();
	public Carros carroGaragem = new Carros();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Garagem g1 = new Garagem();

		g1.carroGaragem.setCor("Preto");
		g1.carroGaragem.setModelo("Golf");
		g1.carroGaragem.setMotor(2.0);
		
		
		g1.carroPasseio.setCor("Preto");
		g1.carroPasseio.setModelo("Corolla");
		g1.carroPasseio.setMotor(2.0);
		
		
		System.out.println("Carro Garagem");
		System.out.println("Cor: "+g1.carroGaragem.getCor());
		System.out.println("Modelo: "+g1.carroGaragem.getModelo());
        System.out.println("Motor: "+g1.carroGaragem.getMotor());
        
        System.out.println("---------------------------------------");
        
        System.out.println("Carro Passeio");
        System.out.println("Cor: "+g1.carroPasseio.getCor());
		System.out.println("Modelo: "+g1.carroPasseio.getModelo());
        System.out.println("Motor: "+g1.carroPasseio.getMotor());
        
	}

}
