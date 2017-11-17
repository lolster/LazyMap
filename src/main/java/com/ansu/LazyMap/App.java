package com.ansu.LazyMap;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main( String[] args ) {
		
		// Normal Map
		MapFactory<String> normFact = MapFactory.getMapFactory(MapFactoryType.NORMALMAP);
		
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		
		Map<String> normMap = normFact.createMap(list1, new Map.Predicate<String>() {
			private static final long serialVersionUID = 1L;

			@Override
			public String doIt(String stuff) {
				return stuff + "_OOMD";
			}
		});
		
		System.out.println(normMap.get(0));
		
		
		// Lazy Map
		MapFactory<String> lazyFact = MapFactory.getMapFactory(MapFactoryType.LAZYMAP);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		list2.add("5");
		
		Map<String> lazyMap = lazyFact.createMap(list2, new Map.Predicate<String>() {
			private static final long serialVersionUID = 1L;

			@Override
			public String doIt(String stuff) {
				return stuff + "_OOMD";
			}
		});
		
		System.out.println(lazyMap.get(0));
		

		
		/*
		 *  Map Persistence
		 */
		
		// Store Map
		MapStore.storeMap(lazyMap, "map1.ser");
		
		// Load same map
		Map<String> storedLazyMap = MapStore.loadMap("map1.ser");
		
		System.out.println(storedLazyMap.get(0));
	}
}
