package com.java.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class JCEx12Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(null, null);
		hm.put("key", null);
		hm.put("key2", null);
		hm.put("key3", "Value3");
		System.out.println(hm);

		Map<String, String> map = new HashMap<String, String>();
		map.put("key3", "Value3");

		map = Collections.synchronizedMap(map);
		System.out.println(map);

		Hashtable<String, String> ht = new Hashtable<>();
		// ht.put(null, null);
		// ht.put("key2", null);
		ht.put("key2", "val2");
		System.out.println(ht);
		
		
		
	}

}
