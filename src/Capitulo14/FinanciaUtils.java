package Capitulo14;

public class FinanciaUtils {

	public static double calcularJurosCompostos(double valorInicial, double taxaJuros, int prazo) {
		double fator = taxaJuros / 100;
		double fatorComposto = Math.pow(fator, prazo);

		return valorInicial + fatorComposto;
	}

	public static double calcularJuros(double valorInicial, double taxaJuros) {
		double razao = taxaJuros / 100;
		double juros = valorInicial * razao;
		return valorInicial + juros;
	} 

	public static double calcularAmortizacao(double valorotal, double valorPrestacao, int prazo) {
		return 0;

	}
    
	public static double calcularPrazo(double valorotal, double valorPrestacao, double taxaJuros) {
		return 0;

	}
    
	
}
