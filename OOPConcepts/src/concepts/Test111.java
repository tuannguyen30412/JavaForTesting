package concepts;

public class Test111 {

	public static void main(String[] args) {
		 DynamicBinding_Polymorphism x = new MotorBike();
		 x.move();
		 x= new DynamicBinding_Polymorphism();
		 x.move();

	}

}
