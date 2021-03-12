package basic;

public class reverseDemo {

	
	
	public static void main(String[] args) {
		 String string = "Geeks for Geeks";
		 
	        StringBuilder sb = new StringBuilder(string);
            System.out.println("1."+sb.reverse().toString());
		//outPut  => skeeG rof skeeG
	
		
		String str = "Nazmul Hoque";
	//	char[] strArray = str.toCharArray();
		for (int i = str.length()-1 ; i >= 0; i--)
		{
		    System.out.print(str.charAt(i));     
		}	
		//OutPut =>euqoH lumzaN
		
		System.out.println("\n");
		
		
		  String text = "abcdef";
	      String reverse = new StringBuffer(text).reverse().toString();
	      System.out.println("String after reverse: "+reverse);
		   // output => String after reverse: fedcba
		
			

	}

	

}
