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

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class Map<T> implements Iterable<T>, Serializable {
	protected static final long serialVersionUID = 1L;

	public abstract T get(int index);
	
	public abstract int size();
	
	public Iterator<T> iterator() {
		return new MapIterator<T>(this);
	}
	
	public static abstract class Predicate<E> implements Serializable{
		private static final long serialVersionUID = 1L;

		public abstract E doIt(E stuff);
	}
	
	public static class MapIterator<E> implements Iterator<E> {
		private int currIndex;
		private Map<E> m;
		
		public MapIterator(Map<E> m) {
			this.currIndex = 0;
			this.m = m;
		}
 		
		public boolean hasNext() {
			return this.currIndex < m.size();
		}

		public E next() throws NoSuchElementException {
			E res = null;
			if (this.hasNext()) {
				res = m.get(currIndex);
				++currIndex;
			} else {
				throw new NoSuchElementException();
			}
			return res;
		}
	}
}
