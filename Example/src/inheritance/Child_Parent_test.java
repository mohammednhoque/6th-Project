package inheritance;

public class Child_Parent_test {

	public static void main(String[] args) {
        Parent parent = new Parent("kamal", 34, "English");
        parent.method_a();
        parent.method_b();
        System.out.println("parent");
        System.out.println("\n");
        //parent.name
		Child child = new Child("jamal", 23, "history", "kasem");
		child.method_a();
		child.method_b(); 
		child.method_c();
		System.out.println("a");
		System.out.println("\n");
		
		Child1 child1 = new Child1("kamal",32,"Science", "Third");
		child1.method_a();
		child1.method_b();
		child1.method_d();
		System.out.println("b");
		System.out.println("\n");
		
			Child2 child2 = new Child2("Hashem",32,"Science", 5);
			child2.method_a();
			child2.method_b();
			child2.method_E();
			System.out.println("c");
			System.out.println("\n");
		Child3 child3 = new Child3("Tomal", 23, "Commerce", "jasim");
			child3.method_a();
			child3.method_b();
			child3.method_c();
			
	}

}
