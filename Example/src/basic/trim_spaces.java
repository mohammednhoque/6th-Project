package basic;

public class trim_spaces {

	public static void main(String[] args) {


		String st = "      I love Bangladesh";
		String str ="     I love Bangladesh";
		System.out.println("1."+st.length());      // numbers of character
		System.out.println("2."+str.trim());        // trim the space from leftside
		
		boolean ss = st.equalsIgnoreCase("I love Bangladesh"); // comparism two lines 1
		System.out.println("3."+ss);               
		
//		String stg = "iloveBangladesh";
//		System.out.println(stg.charAt(2));
		
		
		
		String strg = "iloveBangladesh";
		for (int i = 0; i < strg.length(); i++) {
			System.out.println(strg.charAt(i));
	 	}
		
		char[]xyz =strg.toCharArray();
	for (int i = 0; i<xyz.length; i++) {
			System.out.print(xyz[i]);
		}
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	}

}
