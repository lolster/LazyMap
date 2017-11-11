package com.ansu.LazyMap;

import java.util.List;

public class LazyMap<T> extends Map<T> {
	private List<T> list;
	private Predicate<T> p;
	boolean[] dirtyBit;
	
	public LazyMap(List<T> list, Predicate<T> p) {
		this.list = list;
		this.p = p;
		this.dirtyBit = new boolean[list.size()];
	}
	
	@Override
	public T get(int index) {
		T res = null;
		if(dirtyBit[index]) {
			res = list.get(index);
		}
		else {
			res = p.doIt(list.get(index));
			list.set(index, res);
			dirtyBit[index] = true;
		}
		return res;
	}
	
	@Override
	public int size() {
		return list.size();
	}
}