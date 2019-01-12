package concepts;

import java.io.*;
 interface Interface1 {
	//public static and final
	final int a = 10;
	
	//public and abstract
	 void display();


}
 //a class that implements interface
 class testClass implements Interface1{
	 //implementing the capabilities of interface
public void display() {
	 System.out.println("geek");
}
 //driver code
	 public static void main(String[] args) {
		testClass test = new testClass();
		test.display();
		System.out.println(a);
	}
 }
