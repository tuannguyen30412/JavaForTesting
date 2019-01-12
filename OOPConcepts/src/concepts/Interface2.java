package concepts;
import java.io.*;
 interface Interface2 {
	//all are the abstract methods
	 void changeGear(int a);
	 void speedUp(int a);
	 void applyBrakes(int a);

}

// class Bicyle implements Interface2{
//	 int speed;
//	 int gear;
//	 
//	 //to change gear
//	 @Override
//	 public void changeGear(int newGear) {
//		 gear = newGear;
//	 }
//	 //to increase speed
//	 @Override
//	 public void applyBrakes(int decrement) {
//		 speed = speed  - decrement;
//	 }
//	 public void printStates() {
//		 System.out.println("speed: " + speed + " gear: "+ gear);
//	 }
//	@Override
//	public void speedUp(int increment) {
//		speed = speed + increment;
//		
//	}
//
//}
//
//
//class Bike implements Interface2 {
// 	int speed;
// 	 int gear;
// 	 
// 	 //to change gear
// 	 @Override
// 	 public void changeGear(int newGear) {
// 		 gear = newGear;
// 		
// 		 }
// 	 //to increase speed
// 	 @Override
// 	 public void speedUp(int increment) {
// 		 speed = speed + increment;
// 		 
// 	 }
// 	 //to decrease speed
// 	 public void applyBrakes(int decrement) {
// 		 speed = speed - decrement;
// 	 }
// 	 public void printStates() {
// 		 System.out.println("speed: "+ speed +" gear: "+ gear);
// 	 }
//}
// 
// class GFG {
//
//		public static void main(String[] args) {
//			//creating an instance of Bicyle
//					//doing some operations
//					Bicyle bicyle = new Bicyle();
//					bicyle.changeGear(2);
//					bicyle.speedUp(3);
//					bicyle.applyBrakes(1);
//					
//					System.out.println("Bicycle present state: ");
//					bicyle.printStates();
//					
//					//creating instance of bike
//					Bike bike = new Bike();
//					bike.changeGear(1);
//					bike.speedUp(4);
//					bike.applyBrakes(3);
//					
//					System.out.println("Bike present state: ");
//					bike.printStates();
//					
//				}
//
//		}