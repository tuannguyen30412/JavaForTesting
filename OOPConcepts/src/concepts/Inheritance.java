package concepts;

public class Inheritance {
	//the class has 2 fields
	public int gear;
	public int speed;
	
	//the class has 1 constructor	
	public Inheritance(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void applyingBrakes(int decrement) {
		speed -= decrement;
			
		}
    public void speedUp(int increment) 
    { 
        speed += increment; 
    } 
      
    // toString() method to print info of Bicycle 
    public String toString()  
    { 
        return("No of gears are "+gear 
                +"\n"
                + "speed of bicycle is "+speed); 
    }  
}
