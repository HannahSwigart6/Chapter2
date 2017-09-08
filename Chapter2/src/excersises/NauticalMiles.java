package excersises;

import java.util.Scanner;

public class NauticalMiles {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double  kilometers = 1.852;
		final double  miles = 1.150779;
		double nauticalMile, numberKilometers, numberMiles;
		input = new Scanner(System.in);
		
		System.out.print(" Enter a number of nautical miles >>");
		nauticalMile = input.nextInt();
		
		numberKilometers = kilometers * nauticalMile; 
		numberMiles = miles * nauticalMile;
		
		System.out.println("There is " +numberKilometers+ " kilometers in " +nauticalMile+ " nautical mile.");
		System.out.println("There is "+numberMiles+ " miles in "+nauticalMile+ " naitical mile.");
		
	}

}
