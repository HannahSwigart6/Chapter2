package excersises;
import java.util.Scanner;
public class Eggs {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double individualPrice, DozenPrice;
		int single;
		int NumberOfEggs, total, individualTotal, DozenTotal; 
		
		input = new Scanner(System.in);
		
		System.out.println("How many eggs would you like?>>");
		NumberOfEggs = input.nextInt();
		
		DozenTotal = NumberOfEggs / 12;
		single =  NumberOfEggs % 12;
		individualTotal = single * .45;
		total = (DozenPrice * DozenTotal) + (individualPrice * single); 
		
		System.out.println("That's " +DozenTotal+ " dozons at " +DozenPrice+ " per dozen with " +individualTotal+ " loose eggs at "+individualPrice+ " for a total "
		+ "of " +total+ ".");
		
	}

}
