package basic;

public class Odd_Even_Number_calculation {

	public static void main(String[] args) {
	//Odd Number by 5		
		 for (int i = 0; i <= 100; i++)
	        {
	            if(i % 5 != 0)
	            {
	                continue;
	            }
	             
	            System.out.println(i);
	        }
	System.out.println("====================");
	
	
	//Odd Number by 3	DifferentWay
		
	for (int a=0; a<=100; a=(a+3)) {
		System.out.println(a);
	}
		
		
		
	}

}
