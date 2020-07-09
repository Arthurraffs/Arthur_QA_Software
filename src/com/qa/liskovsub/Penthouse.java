package com.qa.liskovsub;

public class Penthouse extends Appartment {
	
	private int squareFootage;
	private int numberOfBedrooms;
	
	public Penthouse() {
		this.setNumberOfBedrooms(4);
		System.out.println("Appartment size = Penthouse");
	}

	@Override
	public void setSquareFootage(int sqft) {
		this.squareFootage = 150;
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
