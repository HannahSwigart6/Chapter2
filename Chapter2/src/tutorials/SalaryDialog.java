package tutorials;

import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String wageString, dependentsString;
		double wage, weeklyPay;
		int dependents;
		
		final double HOUR_IN_WEEk = 37.5;
		wageString = JOptionPane.showInputDialog(null, "Enter employees hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOUR_IN_WEEk;
		dependentsString = JOptionPane.showInputDialog(null, "How many dependents?",
				"Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentsString);
		JOptionPane.showMessageDialog(null,"Weekly salary is $" + weeklyPay + "\nDeductions will be made for" + dependents + "dependents");

	}

}
