package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_GFG {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		print(map);
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaiah", 20);
		
		System.out.println("size of map is: "+ map.size());
		print(map);
		if(map.containsKey("vishal")) {
			Integer a = map.get("vishal");
			System.out.println(a);
		}
		map.clear();
		print(map);
//		System.out.println(map.get("vaiah"));
//		System.out.println(map.keySet());
//		System.out.println(map.entrySet());
//		System.out.println(map.remove("vaiah", 20));
//		System.out.println(map.entrySet());
		
		
	}
	public static void print(Map<String, Integer> map) {
		if(map.isEmpty()) {
			System.out.println("map is empty");
		}
			else {
				System.out.println(map);
			}
		}
	}


