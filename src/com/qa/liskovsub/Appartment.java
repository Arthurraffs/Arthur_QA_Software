package com.qa.liskovsub;

public abstract class Appartment {
	
	private int squareFootage;
	private int numberOfBedrooms;	
	
	public abstract void setSquareFootage(int sqft);

	public int getSquareFootage() {
		return squareFootage;
	}


	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	@Override
	public String toString() {
		return "Appartment [squareFootage=" + squareFootage + ", numberOfBedrooms=" + numberOfBedrooms + "]";
	}
	
	
	
	
}
