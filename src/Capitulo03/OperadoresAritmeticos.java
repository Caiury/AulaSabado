package Capitulo03;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=10,b=7,c=3;  //Utilizando comando de atribui�ao
    
    //Operadores Aritimeticos
    System.out.println("Operadores Aritmeticos");
    System.out.println("a/b = "+(a/b));
    System.out.println("a%c = "+ (a%c));
    System.out.println("a*b = "+(a*b));
    System.out.println("b-c = "+ (b-c));
    System.out.println("a+b = "+ (a+b));
    
    //Operadores Aritimeticos de opera�a� reduzida
    System.out.println("Operadores Aritimeticos de opera��o reduzida");
    int n=2;
    System.out.println(n+=2);//(n=n+2)-->4
    System.out.println(n-=2);//(n=n-2)-->2
    System.out.println(n*=3);//(n=n*3)-->6
    System.out.println(n/=2);//(n=n/2)-->3
    
	}

}
