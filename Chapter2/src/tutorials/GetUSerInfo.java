package tutorials;
import java.util.Scanner;
public class GetUSerInfo {

	private static Scanner inputDevice;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
		inputDevice = new Scanner(System.in); 
		System.out.println("PLease enter your name >>>>>");
		name = inputDevice.nextLine();
		System.out.println("Please enter your age >>>>>");
		age = inputDevice.nextInt();
		
		System.out.println("Your name is " + name + " and you are "+ age+ " years old");
		
	}

}
