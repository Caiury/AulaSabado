package Copa;

public class TesteCopa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int Copa=2020;
		for(int i =1940;i<=Copa;i+=4) {
		
			
			
			if (i==1940|| i==1944) {
				System.out.println("esse ano não teve copa: "+i);
				continue;
				
			}
			System.out.println("ano de copa: "+i);
		
			}
		
		 
        double []array = {4646,5566,36454,595,677,56645,464};
        
        
        System.out.println(Maior.arrayMaior(array));
		
		
	
	}

}