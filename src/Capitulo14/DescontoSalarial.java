package Capitulo14;

public class DescontoSalarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double salariosBrutos[]= {1350.00,4320.15,8235.25,2500.55,1830.00,850.26,3614.29,12500.00};
     
     double []salariosLiquidos;
    	
  
     
     
  salariosLiquidos =   DoubleArrayUtils.transformaValores(salariosBrutos,(salario)->salario-(salario*10/100));
     
  for (double salarios:salariosLiquidos) {
	  System.out.println(salarios);
  }

     
	}
}
