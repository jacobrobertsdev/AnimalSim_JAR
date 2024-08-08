package tests;
import java.util.Arrays;

import animals.*;

public class Application {

	public static void main(String[] args) {

		// ******* Location Tests *******
		
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

		
		location.setyCoord(-2);
		System.out.println();

		System.out.println(location.getyCoord());
		System.out.println();
		
		System.out.println("***** END LOCATION TESTS *****");
		System.out.println();

		// ******* Animal Tests *******
		
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
		
		finch.setSimID(-123);
		System.out.println();
		
		finch.setLocation(new Location(9, 3));
		System.out.println(Arrays.toString(finch.getLocation().getCoordinates()));
		
		System.out.println("***** END ANIMAL TESTS *****");
		System.out.println();
		
		// ******* Goldfinch Tests *******
//		System.out.println("***** BEGIN GOLDFINCH TESTS *****");
//		
//		Goldfinch g = new Goldfinch(439, new Location(0, 0), 5.3);
//		
//		System.out.println();
//		g.fly(new Location(5, 3));
//		System.out.println(Arrays.toString(g.getLocation().getCoordinates()));
//		
//		
//		
//		
//		
//		
//		System.out.println("***** END GOLDFINCH TESTS *****");

		
		
		// ******* BrownBear Tests *******


	
	}

}
