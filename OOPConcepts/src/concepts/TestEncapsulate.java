package concepts;

public class TestEncapsulate {
	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.setAge(19);
		obj.setName("man");
		obj.setRoll(111);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
	}

}
