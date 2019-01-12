package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_Test {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		  // Adding elements into HashSet using add()
		h.add("India");
		h.add("USA");
		h.add("Australia");
		h.add("India"); //add duplicate
		System.out.println(h);
		System.out.println(h.contains("India"));
		h.remove("Australia");
		System.out.println(h);
		//Iterating over hash set items
		System.out.println("Iterating over list:");
		Iterator<String> i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
