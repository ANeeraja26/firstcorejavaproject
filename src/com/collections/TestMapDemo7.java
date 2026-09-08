package com.collections;

import java.util.Hashtable;
import java.util.Map;

// HashMap vs Hashtable
public class TestMapDemo7 {

	public static void main(String[] args) {
		
		Map<String,Float> map=new Hashtable<>();
		
		map.put("Prabhas", 6.3F);
		map.put("Makesh", 6.1F);
		map.put("NTR", 5.4F);
		map.put("Ram", 6.0F);
		map.put("Akhil", 5.8F);
		map.put("Tej", null);

		
		System.out.println(map);//java.lang.NullPointerException
		// System.out.println(map);//{Prabhas=6.3, Akhil=5.8, Tej=null, Makesh=6.1, NTR=5.4, Ram=6.0}


	}

}
