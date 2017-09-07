package tutorials;

import java.util.Scanner;

public class Page84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anInt ;
		byte aByte ;
		short aShort ;
		long aLong ;
		String Name;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name >>");
		Name = input.nextName();
		System.out.println("Please enter an integer >>");
		anInt = input.nextInt(); 
		System.out.println("Please enter a byte integer>>");
		aByte = input.nextByte();
		System.out.println("Please enter a short integer >>");
		aShort = input.nextShort();
		System.out.println("Please wnter a long >>");
		aLong = input.nextLong();
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.println("Thank you  " + Name);
				
		
		

	}

}
