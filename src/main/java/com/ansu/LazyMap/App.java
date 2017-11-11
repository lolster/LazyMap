package com.ansu.LazyMap;

import java.util.ArrayList;
import java.util.List;

public class App {
	@SuppressWarnings("serial")
	public static void main( String[] args ) {
		List<String> l = new ArrayList<String>();
		l.add("bb");
		l.add("aa");
		
		Map<String> m = new LazyMap<String>(l, new Map.Predicate<String>() {
//			@Override
			public String doIt(String stuff) {
				return stuff + "420";
			}
		});
		
//		System.out.println(m.get(0));
//		System.out.println(m.get(1));
//		System.out.println(m.get(2));
//	
//		System.out.println(m.get(0));
//		System.out.println(m.get(1));
//		System.out.println(m.get(2));
		
//		for(String e : m) {
////			System.out.println("Iterating: " + e);
//		}
		
		// store map
		MapStore.storeMap(m, "map1.ser");
		// load same map
		Map<String> m2 = MapStore.loadMap("map1.ser");

		for(String e : m2) {
			System.out.println("Iterating: " + e);
		}
		
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(10);
		l2.add(20);
		l2.add(30);
		l2.add(40);
		l2.add(50);
		l2.add(60);
		
		Map<Integer> m22 = new LazyMap<Integer>(l2, new Map.Predicate<Integer>() {
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
		
//		for(int e : m22) {
////			System.out.println("Iterating: " + e);
//		}
		
		// store map
		MapStore.storeMap(m22, "map1.ser");
		// load same map
		Map<Integer> m222 = MapStore.loadMap("map1.ser");

		for(int e : m222) {
			System.out.println("Iterating: " + e);
		}
		
		 
	}
}
