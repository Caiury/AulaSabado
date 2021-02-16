package Capitulo14;

public class InteracaoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soma soma = new Soma();
		System.out.println(soma.execute(10, 20));

		
		OperacaoAritimetica operacao;   
		operacao = (n1, n2) -> n1 + n2;  // EXPRESSAO LAMBDA QUE FAZ  QUE SOMA DOIS NUMEROS
		System.out.println(operacao.execute(7, 5));
		
		
		operacao = (n1,n2)-> n1-n2;   // EXPRESSAO LAMBDA QUE SUBTRAI DOIS NUMEROS
		System.out.println(operacao.execute(7, 5));
		
		
		operacao =(n1,n2)-> n1*n2; // EXPRESSAO LAMBDA QUE MULTIPLICA DOIS NUMEROS
		System.out.println(operacao.execute(7, 5));
		
		
		operacao = (n1,n2)-> n1/n2; // EXPRESSAO LAMBDA QUE DIVIDI OS NUMEROS
		System.out.println(operacao.execute(7, 5));
		
		
		
		
		
		
		

	}

}
