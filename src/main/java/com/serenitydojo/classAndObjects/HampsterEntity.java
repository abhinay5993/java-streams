package com.serenitydojo.classAndObjects;

/**
 * 
 * TODO: Inheritance and Polymorphism concepts implementation with - Exercise 2,Exercise 1
 * 
 */
public class HampsterEntity extends AbstractPetEntity {
	
	public HampsterEntity(String name, int age,String favoriteGame) {
		super(name, age);
	}

	@Override
	public String play() {
		return "runs in wheel";
	}

}