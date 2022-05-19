package services;

import beans.Animal;

public interface AnimalService {

	public boolean addAnimal(Animal p);

	public boolean deleteAnimal(int id);

	public Animal getAnimal(int id);

	public Animal[] getAllAnimals();

}
