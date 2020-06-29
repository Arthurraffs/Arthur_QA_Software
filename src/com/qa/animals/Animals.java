package com.qa.animals;

public class Animals {
	
	private int amountLegs = 4;
	private String colour = null;
	private String noise = null;
	
	public Animals(int amountLegs, String colour, String noise) {
		super();
		this.amountLegs = amountLegs;
		this.colour = colour;
		this.noise = noise;
				
	}
	
	public Animals() {
		
	}

	public int getAmountLegs() {
		return amountLegs;
	}

	public void setAmountLegs(int amountLegs) {
		this.amountLegs = amountLegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	
}
