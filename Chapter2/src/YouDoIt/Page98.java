package YouDoIt;
import java.util.Scanner;
public class Page98 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber, secondNumber, sum, difference ;
	double	average;
		input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >>");
		firstNumber = input.nextInt();
		System.out.print("Please enter another integer >>");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average =(double)sum / 2;
		
		System.out.print("\n" +firstNumber + " + " +secondNumber+ " is " +sum);
		System.out.print( "\n"+firstNumber + " - " + secondNumber + " is " +difference);
		System.out.print("\nThe average of " + firstNumber + " and " + secondNumber + " is " +average);
		
	}

}
