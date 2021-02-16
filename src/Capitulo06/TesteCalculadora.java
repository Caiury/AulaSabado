package Capitulo06;

import java.util.Locale;

public class TesteCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Locale.setDefault(Locale.US);

		System.out.println("calc.somar (6,3)=" + calc.somar(6, 3));
		System.out.println("calc.subtrair (6,3)=" + calc.subtrair(6, 3));
		System.out.println("calc.multiplicar (6,3)=" + calc.multiplicar(6, 3));
		System.out.println("calc.dividir (6,3)=" + calc.dividir(6, 3));
		
		// usando sobrecarga metodo subtrair
		System.out.println("-------------------------------------");
		System.out.println("calc.subtrair =" + calc.subtrair(6.00, 2.9));
		System.out.println("calc.subtrair =" + calc.subtrair(1.80,6 ));
		System.out.println("calc.subtrair =" + calc.subtrair(6, 3.2));
	}

}
