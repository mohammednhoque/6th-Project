package keyWord_usage;

import java.util.Scanner;

public class If_Else_KeyWord {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a string :");
         
        String input = scan.next();
         
        if(input.equalsIgnoreCase("JaVA"))
        {
            System.out.println("It's JAVA");
        }
        else
        {
            System.out.println("It's not JAVA");
        }
		
		
		
		
		scan.close();
		
		

	}

}
