package com.ansu.LazyMap;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main( String[] args ) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		Map<Integer> m = new LazyMap<Integer>(l, new LazyMap.Predicate<Integer>() {
//			@Override
			public Integer doIt(Integer stuff) {
				return stuff + 1;
			}
		});
		
//		System.out.println(m.get(0));
//		System.out.println(m.get(1));
//		System.out.println(m.get(2));
//	
//		System.out.println(m.get(0));
//		System.out.println(m.get(1));
//		System.out.println(m.get(2));
		
		for(int e : m) {
			System.out.println("Iterating: " + e);
		}
	}
}
