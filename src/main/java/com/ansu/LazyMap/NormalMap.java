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

import java.util.List;

public class NormalMap<T> extends Map<T> {
	private static final long serialVersionUID = 1L;
	private List<T> list;
	
	protected NormalMap(List<T> list, Predicate<T> p) {
		this.list = list;
		for(int i = 0; i < this.list.size(); ++i) {
			list.set(i, p.doIt(list.get(i)));
		}
	}
	
	@Override
	public T get(int index) {
		return list.get(index);
	}
	
	@Override
	public int size() {
		return list.size();
	}
}
