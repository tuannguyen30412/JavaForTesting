package concepts;

public class Test {

	public static void main(String[] args) {
		StaticBinding_Polymorphism a = new StaticBinding_Polymorphism();
		System.out.println(a.add(2, 3));
		System.out.println(a.add(1, 2, 3));
		System.out.println(a.add(1, 10.0));
		System.out.println(a.add(1.0, 10));
	}

	}


