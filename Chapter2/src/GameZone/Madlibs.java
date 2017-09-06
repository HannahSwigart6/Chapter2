package GameZone;
import java.util. Scanner;
public class Madlibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String color;
		String wordEst;
		String bodyPartPlural;
		String anAnimal, aNoun, PluralNoun;
		
		int a, b, c;
		
		c = a - b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a color >>");
		color = input.nextLine();
		System.out.print(" Enter a word ending in est >>");
		wordEst = input.nextLine();
		System.out.print("Enter a body part (Plural)");
		bodyPartPlural = input.nextLine();
		System.out.print(" Enter a animal");
		anAnimal = input.nextLine();
		System.out.print("Enter a noun");
		aNoun = input.nextLine();
		System.out.print(" enter a plural noun");
		PluralNoun = input.nextLine();
		
		
		c = a - b;
		
		System.out.print("The " + color + " Dragon is the " + wordEst + " Dragon of all.");
		System.out.print("\n It has " );
	}

}
