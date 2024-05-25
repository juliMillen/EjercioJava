package prog3_ejerciciotipoParcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparator.Ordenador;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Dog> list= new ArrayList<Dog>();
		list.add(new Dog("Shaggy",3));
		list.add(new Dog("Lacy",2));
		list.add(new Dog("Roger",10));
		list.add(new Dog("Lacy",4));
		list.add(new Dog("Tammy",1));
		
		Collections.sort(list, new Ordenador());
		System.out.println(" ");
		for(Dog a:list) {
			System.out.println(a.getName() + ": "+ a.getAge());
		}
	}

}
