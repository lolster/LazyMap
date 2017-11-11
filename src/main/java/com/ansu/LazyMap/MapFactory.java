package com.ansu.LazyMap;

import java.util.List;

public abstract class MapFactory<T> {
	public abstract Map<T> createMap(List<T> list, Map.Predicate<T> p);
	
	public static <E> MapFactory<E> getMapFactory(MapFactoryType type) {
		switch(type) {
			case LAZYMAP:
				return new LazyMapFactory<E>();
			case NORMALMAP:
				return new NormalMapFactory<E>();
			default:
				return null;
		}
	}
}

enum MapFactoryType {
	LAZYMAP,
	NORMALMAP
}

class NormalMapFactory<T> extends MapFactory<T> {
	protected NormalMapFactory() {}
	
	@Override
	public NormalMap<T> createMap(List<T> list, Map.Predicate<T> p) {
		return new NormalMap<T>(list, p);
	}
}

class LazyMapFactory<T> extends MapFactory<T> {
	protected LazyMapFactory() {}
	
	@Override
	public LazyMap<T> createMap(List<T> list, Map.Predicate<T> p) {
		return new LazyMap<T>(list, p);
	}
}
