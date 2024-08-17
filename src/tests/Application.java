package tests;
import java.util.ArrayList;
import java.util.Arrays;

import animals.*;
import exceptions.InvalidCoordinateException;
import exceptions.InvalidSimIDException;
import exceptions.InvalidSubspeciesException;
import exceptions.InvalidWingspanException;

public class Application {

	public static void main(String[] args) {

		// ******************************
		// ******* Location Tests *******
		// ******************************

		System.out.println("***** BEGIN LOCATION TESTS *****");
		System.out.println();

		Location location = new Location(2, 3);
		
		System.out.println(Arrays.toString(location.getCoordinates()));
		System.out.println();
		
		location.update(4, 5);
		
		System.out.println(Arrays.toString(location.getCoordinates()));
		System.out.println();

		location.setxCoord(0);
		System.out.println(location.getxCoord());
		System.out.println();

		
		try { 
			location.setyCoord(-2); // Throws exception
		} catch (InvalidCoordinateException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();

		System.out.println(location.getyCoord());
		System.out.println();
		
		System.out.println("***** END LOCATION TESTS *****");
		System.out.println();

		// ****************************
		// ******* Animal Tests *******
		// ****************************
		
		//Animal animal = new Animal();
		// Creates Compiler error
		
		System.out.println("***** BEGIN ANIMAL TESTS *****");
		System.out.println();

		Goldfinch finch = new Goldfinch(8583, new Location(10, 14), 10.0);
		
		finch.eat();
		System.out.println(finch.isFull());
		finch.setFull(true);
		System.out.println(finch.isFull());
		System.out.println();
		
		finch.sleep();
		System.out.println(finch.isRested());
		finch.setRested(true);
		System.out.println(finch.isRested());
		System.out.println();
		
		System.out.println(finch.getSimID());
		System.out.println();
		
		try {
			finch.setSimID(-123); // Throws exception
		} catch (InvalidSimIDException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println();
		
		finch.setLocation(new Location(9, 3));
		System.out.println(Arrays.toString(finch.getLocation().getCoordinates()));
		System.out.println();
		
		System.out.println("***** END ANIMAL TESTS *****");
		System.out.println();
		
		// *******************************
		// ******* Goldfinch Tests *******
		// *******************************

		System.out.println("***** BEGIN GOLDFINCH TESTS *****");
		System.out.println();

		Goldfinch g = new Goldfinch(439, new Location(0, 0), 5.3);
		System.out.println(Arrays.toString(g.getLocation().getCoordinates()));
		System.out.println();
		
		g.fly(new Location(5, 3));
		System.out.println(Arrays.toString(g.getLocation().getCoordinates()));
		System.out.println();
		
		g.walk(2);
		System.out.println(Arrays.toString(g.getLocation().getCoordinates()));
		System.out.println();
		
		System.out.println(g.getWingSpan());
		System.out.println();
		
		try {
			g.setWingSpan(4.0); // Throws exception
		} catch (InvalidWingspanException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		System.out.println(g); // toString
		System.out.println();
		
		System.out.println("***** END GOLDFINCH TESTS *****");
		System.out.println();

		
		// *******************************
		// ******* BrownBear Tests *******
		// *******************************
		
		System.out.println("***** BEGIN BROWNBEAR TESTS *****");
		System.out.println();
		
		BrownBear b = new BrownBear(871, new Location (2, 9), "Kodiak");
		System.out.println(Arrays.toString(b.getLocation().getCoordinates()));
		System.out.println();
		
		b.swim(3);
		System.out.println(Arrays.toString(b.getLocation().getCoordinates()));
		System.out.println();
		
		b.walk(2);
		System.out.println(Arrays.toString(b.getLocation().getCoordinates()));
		System.out.println();
		
		System.out.println(b.getSubSpecies());
		System.out.println();
		
		try {
			b.setSubSpecies("Invalid subspecies"); // Throws exception
		} catch (InvalidSubspeciesException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		b.setSubSpecies("Grizzly");
		System.out.println(b.getSubSpecies());
		System.out.println();
		
		System.out.println(b); // toString
		System.out.println();
		
		System.out.println("***** END BROWNBEAR TESTS *****");
		System.out.println();
		
		
		// ******************************
		// ******* Generics Tests *******
		// ******************************
		
		System.out.println("***** BEGIN GENERICS TESTS *****");
		System.out.println();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
//		Goldfinch finch1 = new Goldfinch();
//		finch1.setSimID(499);
		
		Goldfinch finch2 = new Goldfinch(8888, new Location(9,7), 6.2);
		
//		BrownBear bear1 = new BrownBear();
//		bear1.setSimID(93333);
		
		BrownBear bear2 = new BrownBear(2414, new Location (2,2), "Kodiak");
		
//		animals.add(finch1);
		animals.add(finch2);
//		animals.add(bear1);
		animals.add(bear2);
		
		for(Animal animal : animals) {
			System.out.println(animal); // toString
			System.out.println();
		}
		
		System.out.println("***** END GENERICS TESTS *****");
		System.out.println();
	
	}

}
