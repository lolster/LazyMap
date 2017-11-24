/**
 * Description: LazyMap implementation in Java
 * 
 * Authors:
 * Sushrith Arkal  (01FB14ECS262)
 * Varun Bharadwaj (01FB14ECS278)
 * Varun Majunath  (01FB14ECS280)
 * Suhas Kashyap   (01FB14ECS255)
 * 
 * Seventh Semester,
 * CSE Department,
 * PES University,
 * Bangalore, India
*/

package com.ansu.LazyMap;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main( String[] args ) {
		
		/*
		 * Normal Map
		 * 
		 * create normMap factory from the MapFactory abstract factory
		 * just a normal map
		 */
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

		/*
		 * Lazy Map
		 * 
		 * create lazyMap factory from the MapFactory abstract factory
		 * prints "computed" when map is actually evaluated
		 * is not evaluated the next time 
		 */
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
		 *  
		 *  serialize and store as map1.ser
		 *  read it back using a proxy since deserialization is costly
		 *  rehydrating the persisted object is lazy 
		 */
		// Store Map
		MapStore.storeMap(lazyMap, "map1.ser");
		
		// Load same map
		Map<String> storedLazyMap = MapStore.loadMap("map1.ser");
		
		System.out.println(storedLazyMap.get(0));
	}
}
