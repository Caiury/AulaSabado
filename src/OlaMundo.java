import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
	//	System.out.println("Ol� Mundo !!!");
       System.out.println("Digite seu nome ? ");
		String nome= sc.next();
       
		System.out.println("Ol� "+nome);
		sc.close();
	}

}
