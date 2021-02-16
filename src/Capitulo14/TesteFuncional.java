package Capitulo14;

public class TesteFuncional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceFuncionalSemParametro func = () -> System.out.println("Olá Mundo"); // INTERFACE FUNCIONAL SEM
																						// PARAMETRO
		func.mostrar();

		InterfaceFuncionalUmParametro func02 = (x) -> x.toUpperCase(); // INTERFACE FUNCIONAL COM UM PARAMETRO
		System.out.println(func02.executar("faculdade impacta"));

		InterfaceFuncionalEmBloco func03 = (x) -> { // INTERFACE FUNCIONAL EM BLOCO
			if (x != null) {
				return x.length();
			}
			return 0;
		};
		System.out.println(func03.executar("caiury"));
		
		
	OperacaoAritimetica n = (n1,n2)->n1+n2;
   	System.out.println(n.execute(10, 10));

		
		OperacaoAritimetica ref_metodo = FinanciaUtils::calcularJuros;
		System.out.println(ref_metodo.execute(1000,10));
		
		
		
 OperacaoAritimetica obj = (n1,n2)->n1*n2;
 System.out.println(obj.execute(10, 10));
	
	}

}