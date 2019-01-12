package concepts;

//Base Class
 class Parent_MethodOverriding {
	void show( ) {
		System.out.println("Parent's show()");
	}
 }
//Inherited Class
class Child extends Parent_MethodOverriding{
	//this method overrides show() of Parent
	@Override
	void show() {
		System.out.println("Child's show()");
	}
}


