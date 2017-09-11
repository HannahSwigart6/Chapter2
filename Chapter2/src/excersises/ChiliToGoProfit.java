package excersises;
import java.util.Scanner;
public class ChiliToGoProfit {
	private static Scanner input;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Total,AdultMeals,ChildrenMeals;
		int AdultTotal, ChildrenTotal;
		double profit, adultProfit, childrenProfit;
		input = new Scanner(System.in);
		
		
		
		System.out.println("Enter the amount of meals sold to Adults >>");
		AdultMeals = input.nextInt();
		
		System.out.println("Enter the amount of meals sold to children >>");
		ChildrenMeals = input.nextInt();
		
		
		AdultTotal= (AdultMeals * 7);
		ChildrenTotal = (ChildrenMeals * 4);
        Total =(AdultTotal + ChildrenTotal);
        
        adultProfit = AdultTotal -(4.35 * AdultMeals)  ;
        childrenProfit = ChildrenTotal-(3.10 * ChildrenMeals)  ;
        profit = adultProfit + childrenProfit;
        
        System.out.println("You sold " + AdultMeals+ " meals to adults and "+ChildrenMeals+ " meals to children, you made $" 
        + Total+"\nYou made a profit of " +profit+".");
        
		
		
		
	}

}
