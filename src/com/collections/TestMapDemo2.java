package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo2 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("TG", "Telangana");
        map.put("Ap", "Andhrapradesh");
        map.put("KA", "Karnataka");
        map.put("TN", "TamilNadu");
        map.put("KL", "Kerala");

        System.out.println(map.containsKey("TG"));//true
        System.out.println(map.get("KL"));//Kerala
        System.out.println(map.keySet());//[KL, TG, KA, TN, Ap]

        System.out.println(map.values());//[Kerala, Telangana, Karnataka, TamilNadu, Andhrapradesh]


        Set<Entry<String, String>> set = map.entrySet();

        for (Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + "->" + entry.getValue());//KL->Kerala
                                                                         //TG->Telangana
                                                                         //KA->Karnataka
                                                                         //TN->TamilNadu
                                                                          //Ap->Andhrapradesh
        }
		
		System.out.println(map);//{KL=Kerala, TG=Telangana, KA=Karnataka, TN=TamilNadu, Ap=Andhrapradesh}


		
	}

}
