package concepts;
//overloading example
class StaticBinding_Polymorphism {
 public int add(int x, int y) {
	 return x+y;
 }
 public int add(int x, int y, int z) {
	 return x+y+z;
 }
 public int add(double x, int y) {
	 return (int)x+y;
 }
 public int add(int x, double y) {
	 return x + (int)y;
 }
}

class Test1{
	public static void main(String[] args) {
		StaticBinding_Polymorphism a = new StaticBinding_Polymorphism();
		System.out.println(a.add(2, 3));
		System.out.println(a.add(1, 2, 3));
		System.out.println(a.add(1, 10.0));
		System.out.println(a.add(1.0, 10));
	}
}
