package concepts;

public class Constructor_Examples {
// a constructor is a block of code, similar to a method which is used to initialize all instances of your class.
// Constructor_Examples object1 = new Constructor_Examples();
	
//Constructor_Examples object1 : a variable of type Constructor_Examples is created and is used to 
//refer a Constructor_Examples object
	
//To create a new instance of an object from a class Constructor_Examples, use 'new' keyword along with the
//default constructor Constructor_Examples()
	
//The constructor Constructor_Examples() is responsible for initializing the new object

// Constructor_Examples object1 = new Constructor_Examples(); meaning:
//this is a statement that declares a variable of type Constructor_Examples, call Constructor_Examples  
//constructor to create a new Constructor_Examples object and assigns a reference to the Constructor_Examples 
//object to the variable object1.

//both parameterized and non-parameterized constructors are used to initialize values for instances
//*Example for non-parameterized constructor:

//1. create variables of type double
	double width;
	double height;
	double depth;
	
//2. create non-parameterized constructor 
	
//	Constructor_Examples() {
//		width = 10;
//		height = 10;
//		depth = 10;
//	}
//2'. create parameterized constructor
//the benefit of parameterized constructor is to ensure all the variables declared refer to the class (with this keyword)
//the way to pass values for variables are more convenient inside the parameterized constructor when creating the object (see below)
//security: only the local variables (w, h and d) are shown instance variables (width, height, depth) are hidden in the constructor
//this security is more effective when you want to do inheritance with super keyword
	Constructor_Examples(double w, double h, double d) {
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
//3. method to return the volume
	double volume() {
		return width*height*depth;
	}
		
}

//4. using constructor to get volume

	class getVolume{
		public static void main(String[] args) {
			//declare, allocate, and initialize non-parameterized Constructor_Examples object
			//Constructor_Examples obj = new Constructor_Examples();
			//declare, allocate, and initialize parameterized Constructor_Examples object
			Constructor_Examples obj = new Constructor_Examples(10, 10, 10);
			double vol = obj.volume();
			
			System.out.println(vol);
		}
	}
