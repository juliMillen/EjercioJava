package Comparator;

import java.util.Comparator;

import prog3_ejerciciotipoParcial.Dog;

public class Ordenador implements Comparator<Dog> {

	@Override
	public int compare(Dog dog1, Dog dog2) {
		// TODO Auto-generated method stub
		int m= dog1.getName().compareTo(dog2.getName());
		if(m==0) {
			return dog1.getAge() - dog2.getAge();
		}
		return m;
	}
}
