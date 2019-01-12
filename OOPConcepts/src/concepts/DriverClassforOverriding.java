package concepts;

public class DriverClassforOverriding {

	public static void main(String[] args) {
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent_MethodOverriding obj1 = new Parent_MethodOverriding();
		obj1.show();
		//If a Parent type reference refers to a Child object Child's show() is called. This is RUN TIME POLYMORPHISM
		Parent_MethodOverriding obj2 = new Child();
		obj2.show();

	}

}
