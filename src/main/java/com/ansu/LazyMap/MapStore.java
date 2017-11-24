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

public class MapStore {
	public static <T> void storeMap(Map<T> map, String filePath) {
		MapSerializer.storeMap(map, filePath);
	}

	public static <T> Map<T> loadMap (String fileName) {
		return new MapProxy<T>(fileName);
	}
}