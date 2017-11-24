/**
 * Description: LazyMap implementation in Java
 * 
 * Authors:
 * Sushrith Arkal  (01FB14ECS262)
 * Anush S Kumar   (01FB14ECS037)
 * 
 * Seventh Semester,
 * CSE Department,
 * PES University,
 * Bangalore, India
 */

package com.ansu.LazyMap;

import java.util.Iterator;

@SuppressWarnings("serial")
public class MapProxy<T> extends Map<T> implements Iterable<T> {
	private Map<T> map;
	private String filePath;
	
	public MapProxy(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public T get(int index) {
		if (this.map == null) {
			loadMap();
		}
		return this.map.get(index); 
	}

	@Override
	public int size() {
		if (this.map == null) {
			loadMap();
		}
		return this.map.size();
	}
	
	public Iterator<T> iterator() {
		if (this.map == null) {
			loadMap();
		}
		return this.map.iterator();	
	}
	
	private void loadMap() {
		this.map = MapSerializer.loadMap(this.filePath);
	}

}