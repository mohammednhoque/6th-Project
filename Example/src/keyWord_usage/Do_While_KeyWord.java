package keyWord_usage;

public class Do_While_KeyWord {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		do {
			a = a + b;
			b = b + 1;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		} 
		while (a < 10);

	}

}
