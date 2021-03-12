 package inheritance;

public class Parent {

	String name, Subject;
	int age;

	public Parent(String name, int age, String Subject) {
		this.name = name;
		this.age = age;
		this.Subject = Subject;
	}

	public void method_a() {
		System.out.println("Name: " + name);
		System.out.println("Age:  " + age);
	}

	public void method_b() {
		System.out.println("Subject: " + Subject);
	}
}
