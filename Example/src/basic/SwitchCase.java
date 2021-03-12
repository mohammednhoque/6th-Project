package basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCase {

	public static void main(String[] args) {
	
		
		
		
				Scanner scanner = new Scanner(System.in);
		         
		        System.out.println("Enter Day :");
		         
		         int day = scanner.nextInt();
		         
		      //  String day =sc.nextLine();
		        	        
		        
		        switch (day){
		            case 1 : System.out.println("SUNDAY");
		            break;
		             
		            case 2 : System.out.println("MONDAY");
		            break;
		 
		            case 3 :  WebDriver driver = new ChromeDriver ();  // System.out.println("TUESDAY");
	                              driver.get("http://google.com");
	                break;
		          
		            case 4 : System.out.println("WEDNESDAY");
		            break;
		             
		            case 5 : System.out.println("THURSDAY");
		            break;
		             
		            case 6 : System.out.println("FRIDAY");
		            break;
		             
		            case 7 : System.out.println("SATURDAY");
		            break;
		             
	              default: System.out.println("Invalid");
	              break;
		        }
		    
		
		
		
		
	scanner.close();
		
		
		
		
		
		
	}

}
