package com.qa.hashsetexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<>();

		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);

		System.out.println(hashSet);
		System.out.println(hashSet.isEmpty());
		if (hashSet.size() == 0) {
			System.out.println("hashSet is empty.");
		} else {
			System.out.println(hashSet.size());
		}
		
		hashSet.removeAll(hashSet); 
		System.out.println(hashSet);
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		Iterator<Integer> setIterator = hashSet.iterator();
		while (setIterator.hasNext()){
		    int obj = setIterator.next();
		    setIterator.remove();
		}
		
		System.out.println(hashSet);
		
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		
		System.out.println(hashSet.contains(2));
	}

}
