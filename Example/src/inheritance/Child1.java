 package inheritance;

public class Child1 extends Parent{

	
	String semister;
	
	public Child1(String name, int age, String Subject, String semister) {
		super(name, age, Subject);
		this.semister = semister;
	}
		
		void method_d() {
			
			System.out.println("Semister:  "+ semister);
		}
		
		
		
		
	

	
	
	
	
	
}
