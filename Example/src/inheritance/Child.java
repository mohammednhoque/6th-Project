package inheritance;

public class Child extends Parent {

	
	
	
	String T_name;

	public Child(String name, int age, String Subject, String T_name) {
		super(name, age, Subject);
		this.T_name= T_name;
	}

	public void method_c () {
		System.out.println("Teacher: "+ T_name);
	}
		
	
	
}
