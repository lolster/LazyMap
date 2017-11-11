package com.ansu.LazyMap;

import java.util.List;

public class NormalMap<T> extends Map<T> {
	private List<T> list;
	
	public NormalMap(List<T> list, Predicate<T> p) {
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