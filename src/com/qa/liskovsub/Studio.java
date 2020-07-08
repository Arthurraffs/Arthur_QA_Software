package com.qa.liskovsub;

public class Studio extends Appartment {
	
	private int squareFootage;
	private int numberOfBedrooms;
	
	public Studio() {
		this.setNumberOfBedrooms(0);
		System.out.println("Appartment size = studio");
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.squareFootage = sqft;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getSquareFootage() {
		return squareFootage;
	}
	
	
}
