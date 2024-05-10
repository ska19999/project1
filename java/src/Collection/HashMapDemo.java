package Collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap hm = new HashMap();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "john");
		hm.put(102, "scott");
		hm.put(103, "marry");
		hm.put(104, "scott");
		hm.put(102, "nike");
		
		System.out.println(hm);  //{101=john, 102=nike, 103=marry, 104=scott}
		
		System.out.println("size of hashmap : " + hm.size());  //size of hashmap = 4
		
		//access value of key
		System.out.println(hm.get(102));  // 102 is key -- nike is value
		
		//get all the key from hash map
		System.out.println(hm.keySet());  // [101, 102, 103, 104]
		System.out.println(hm.values());  // [john, nike, marry, scott]
		System.out.println(hm.entrySet());// [101=john, 102=nike, 103=marry, 104=scott]  this will get all the keys with value
		
		// reading data from hashmap
		for(int k : hm.keySet()) {
			System.out.println(k + "    " + hm.get(k));
		}
		
		
	}

}
