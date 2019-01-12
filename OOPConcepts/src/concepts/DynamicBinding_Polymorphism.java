package concepts;
//overriding example
 class DynamicBinding_Polymorphism {
 public void move() {
	 System.out.println("Vehicle can move");
 }
}
 class MotorBike extends DynamicBinding_Polymorphism{
	 public void move() {
		 System.out.println("MotorBike can move and accelerate");
	 }
 }
 class Test11{
	 public static void main(String[] args) {
		 DynamicBinding_Polymorphism x = new MotorBike();
		 x.move();
		 x= new DynamicBinding_Polymorphism();
		 x.move();
	}
 }
