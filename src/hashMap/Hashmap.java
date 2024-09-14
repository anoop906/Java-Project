package hashMap;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(101, "Ritesh");
		hm.put(102, "Anuj");
		hm.put(103, "Ratnakar");
		hm.put(104, "Virat");
		System.out.println(hm);
		System.out.println(hm.get(102));// It will give the associated value.
		System.out.println(hm.containsKey(104));//if key match, it will return true
		System.out.println(hm.containsKey(200));// if key not match will return false.
		System.out.println(hm.containsValue("rohit"));//if value not match will return false
		System.out.println(hm.containsValue("Ratnakar"));

	}

}
