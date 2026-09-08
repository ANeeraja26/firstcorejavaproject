package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo3 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("IN", "India");
		map.put("US", "United States");
		map.put("UK", "United Kingdom");
		map.put("CA", "Canada");
		map.put("AU", "Australia");
		map.put("JP", "Japan");

		System.out.println(map.put("US", "USA"));// United States
		System.out.println(map.put("SR", "Srilanka"));// null
	System.out.println(map);//{AU=Australia, IN=India, UK=United Kingdom,
		// JP=Japan, US=United States, CA=Canada}

		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue()); // 
																		//AU->Australia
																		//IN->India
																		//UK->United Kingdom
																		//JP->Japan
																		//US->USA
																		//CA->Canada
																		//SR->Srilanka


		}

	}

}
