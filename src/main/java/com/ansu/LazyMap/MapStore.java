package com.ansu.LazyMap;

public class MapStore {
	public static <T> void storeMap(Map<T> map, String filePath) {
		MapSerializer.storeMap(map, filePath);
	}

	public static <T> Map<T> loadMap (String fileName) {
		return new MapProxy<T>(fileName);
	}
}