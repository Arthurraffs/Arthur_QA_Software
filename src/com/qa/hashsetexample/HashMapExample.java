package com.qa.hashsetexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, String> capitalCities = new HashMap<>();

		capitalCities.put("England", "London");
		capitalCities.put("Russia", "Moscow");
		capitalCities.put("Japan", "Tokyo");

		System.out.println(capitalCities);
		System.out.println(capitalCities.get("England"));

		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}

		for (String i : capitalCities.values()) {
			System.out.println(i);
		}
		
		for (Entry<String, String> i : capitalCities.entrySet()){
		    System.out.println(i);
		}
	}

}
