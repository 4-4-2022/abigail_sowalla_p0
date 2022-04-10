package com.fishyfriends.Model;

public class Animal{
	
	// the species of the animal
	public String species; 
	// how difficult it is to keep this animal as a pet
	public String difficulty;  
	// can this animal be kept with other animals?
	public boolean social;
	// fresh water or salt water
	public String waterType;
	
	public Animal(String species, String difficulty, boolean social, String waterType) {
		
		super();
		
		this.species = species;
		this.difficulty = difficulty;
		this.social = social;
		this.waterType = waterType;
	}

}
