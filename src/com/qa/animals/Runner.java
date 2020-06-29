package com.qa.animals;

public class Runner {

	public static void main(String[] args) {
		
		Dogs barney = new Dogs();
		barney.setColour("Black");
		barney.setBreed("Bernese");
		barney.setLitter(3);
		System.out.println("Barney's colour is: " + barney.getColour());
		System.out.println("Barney's breed is: " + barney.getBreed());
		System.out.println("Barney has had a litter of " + barney.getLitter() + " puppies.");
		barney.dogNoise();
		barney.dogLegs();
		
		System.out.println("");
		
		Cats slinky = new Cats();
		slinky.setColour("Black");
		slinky.setChonkiness("Quite");
		slinky.setNiceOrNot(true);
		System.out.println("SLinky's colour is: " + slinky.getColour());
		System.out.println("SLinky's chonkiness is: " + slinky.getChonkiness() + " chonky.");
		System.out.println("Is Slinky a nice cat? " + slinky.isNiceOrNot());
		slinky.catNoise();
		slinky.catLegs();
		
	}

}
