package inheritance;

public class Child2 extends Parent {

	
	int Roll;
	
	
	
	public Child2(String name, int age, String Subject,int R ) {
		super(name, age, Subject);
		Roll = R;
		}

	public void method_E() {
		
		System.out.println("Roll: " + Roll);
	}
	}
