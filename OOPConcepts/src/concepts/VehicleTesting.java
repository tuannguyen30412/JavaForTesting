package concepts;

public class VehicleTesting implements Interface2{
	 int speed;
	 int gear;
	 
	 //to change gear
	 @Override
	 public void changeGear(int newGear) {
		 gear = newGear;
	 }
	 //to increase speed
	 @Override
	 public void applyBrakes(int decrement) {
		 speed = speed  - decrement;
	 }
	 public void printStates() {
		 System.out.println("speed: " + speed + " gear: "+ gear);
	 }
	@Override
	public void speedUp(int increment) {
		speed = speed + increment;
		
	}

}


class Bike1 implements Interface2 {
	int speed;
	 int gear;
	 
	 //to change gear
	 @Override
	 public void changeGear(int newGear) {
		 gear = newGear;
		
		 }
	 //to increase speed
	 @Override
	 public void speedUp(int increment) {
		 speed = speed + increment;
		 
	 }
	 //to decrease speed
	 public void applyBrakes(int decrement) {
		 speed = speed - decrement;
	 }
	 public void printStates() {
		 System.out.println("speed: "+ speed +" gear: "+ gear);
	 }
}

class GFGG {

		public static void main(String[] args) {
			//creating an instance of Bicyle
					//doing some operations
			VehicleTesting bicyle = new VehicleTesting();
					bicyle.changeGear(2);
					bicyle.speedUp(3);
					bicyle.applyBrakes(1);
					
					System.out.println("Bicycle present state: ");
					bicyle.printStates();
					
					//creating instance of bike
					Bike1 bike = new Bike1();
					bike.changeGear(1);
					bike.speedUp(4);
					bike.applyBrakes(3);
					
					System.out.println("Bike present state: ");
					bike.printStates();
					
				}

		} 


