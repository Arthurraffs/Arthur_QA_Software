package com.qa.animals;

public class Cats extends Animals {
	
	private boolean niceOrNot;
	private String chonkiness;
	
	public void catNoise() {
		System.out.println("Cats noise = Meow");
	}
	
	public void catLegs() {
		System.out.println("Cats have " + getAmountLegs() + " legs.");
	}

	public Cats(int amountLegs, String colour, String noise, boolean niceOrNot, String chonkiness) {
		super(amountLegs, colour, noise);
		this.niceOrNot = niceOrNot;
		this.chonkiness = chonkiness;
	}
	
	public Cats() {
		
	}

	public boolean isNiceOrNot() {
		return niceOrNot;
	}

	public void setNiceOrNot(boolean niceOrNot) {
			this.niceOrNot = niceOrNot;
	}

	public String getChonkiness() {
		return chonkiness;
	}

	public void setChonkiness(String chonkiness) {
		this.chonkiness = chonkiness;
	}
	
	
}
