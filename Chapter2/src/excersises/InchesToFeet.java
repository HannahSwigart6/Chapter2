package excersises;
import java.util.Scanner;
public class InchesToFeet {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 double inch ;
		 double feet;
		 double feetTotal;
		 double inchesTotal;
		input = new Scanner(System.in);
		
		System.out.println("Enter in inches >>");
		inch = input.nextInt();
		
		System.out.println("Enter in feet >>");
		feet = input.nextInt();
		
		feetTotal = inch / 12;
		inchesTotal = feet * 12;
		
		
		System.out.println("You put in " +inch+ " inch/inches which equals to " + feetTotal + "feet.");
		System.out.println("You put in "+feet+ " foot/feet which equals to " +inchesTotal+ "inches");
		

	}

}
