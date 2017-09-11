package excersises;
import java.util.Scanner;
public class Eggs {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double individualPrice, DozenPrice;
		double Single;
		double Dozen;
		int Eggs;
		double individualTotal,DozenTotal,total ; 
		
		input = new Scanner(System.in);
		
		System.out.println("How many eggs would you like?>>");
		Eggs = input.nextInt();
		
		Dozen = (Eggs / 12);
		Single = (Eggs % 12);
		individualTotal =  (Single * .45);
		DozenTotal = (Dozen * 3.25);
		total =   individualTotal + DozenTotal;
		
		System.out.println("That's " +Dozen+ " dozons at " +DozenTotal+ " per dozen with " +Single+ " loose eggs at "+individualTotal+ " for a total "
		+ "of " +total+ ".");
		
	}
	}