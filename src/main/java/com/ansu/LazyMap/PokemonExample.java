package com.ansu.LazyMap;

import java.util.ArrayList;

interface MakeSound{
	public void makeSound();
}

abstract class Pokemon implements MakeSound{
	int dexId;
	int level;

	public abstract void makeSound();

	public Pokemon(int dexId, int level){
		this.dexId=dexId;
		this.level=level;
	}
}

class Pikachu extends Pokemon{
	public Pikachu(int dexId, int level)
	{
		super(dexId,level);
	}

	@Override
	public void makeSound(){
		System.out.println("Pikachuuuu!");
	}
}

class Piplup extends Pokemon{
	public Piplup(int dexId, int level)
	{
		super(dexId,level);
	}

	@Override
	public void makeSound(){
		System.out.println("Piplup pip!");
	}
}

public class PokemonExample{
	public static void main(String[] args) {
		MapFactory<Pokemon> mapFactory=MapFactory.getMapFactory(MapFactoryType.LAZYMAP);

		ArrayList<Pokemon> list1=new ArrayList<Pokemon>();
		list1.add(new Pikachu(25, 100));
		list1.add(new Piplup(25, 100));

		Map<Pokemon> soundMap=mapFactory.createMap(list1, new Map.Predicate<Pokemon>(){
			@Override
			public Pokemon doIt(Pokemon p)
			{
				p.makeSound();
				return p;
			} 
		});

		soundMap.get(0);
		soundMap.get(1);
	}
}