package excersises;

import java.util.Scanner;

public class QuartsToGallons {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int quartsInGallons = 4;
		
		int quartsNeeded;
		int gallonsNeeded;
		int extraQuarts;
		input = new Scanner(System.in);
		
		System.out.print("Enter quarts needed>> ");
		quartsNeeded = input.nextInt();
		
		gallonsNeeded = quartsNeeded / quartsInGallons;
		extraQuarts = quartsNeeded % quartsInGallons;
		
		System.out.print("You have " + gallonsNeeded + " gallons and " + extraQuarts + " quarts left over.");
	}

}
