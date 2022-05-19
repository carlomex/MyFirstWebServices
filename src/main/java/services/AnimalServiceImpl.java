package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import beans.Animal;

public class AnimalServiceImpl implements AnimalService {
	
private static Map<Integer,Animal> animals = new HashMap<Integer,Animal>();
	
	@Override
	public boolean addAnimal(Animal p) {
		if(animals.get(p.getId()) != null) return false;
		animals.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean deleteAnimal(int id) {
		if(animals.get(id) == null) return false;
		animals.remove(id);
		return true;
	}

	@Override
	public Animal getAnimal(int id) {
		return animals.get(id);
	}

	@Override
	public Animal[] getAllAnimals() {
		Set<Integer> ids = animals.keySet();
		Animal[] p = new Animal[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = animals.get(id);
			i++;
		}
		return p;
	}

}
