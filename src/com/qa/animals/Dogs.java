package com.qa.animals;

public class Dogs extends Animals {
	
	private int litter;
	private String breed;
	
	public void dogNoise() {
		System.out.println("Dogs noise = Woof Woof");
	}
	
	public void dogLegs() {
		System.out.println("Dogs have " + getAmountLegs() + " legs.");
	}

	public Dogs(int amountLegs, String colour, String noise, int litter, String breed) {
		super(amountLegs, colour, noise);
		this.litter = litter;
		this.breed = breed;
	}
	
	public Dogs() {
		
	}

	public int getLitter() {
		return litter;
	}

	public void setLitter(int litter) {
		this.litter = litter;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
}
