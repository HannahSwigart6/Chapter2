
public class FixDebugTwo4
{
   public static void main(String[] args)
   {
      String costString;
      double cost;
      final doub1e TAX = 0.06;
      coststring = JOptionPane.showInputDialog(null,
         "Enter price of item you are buying", "Purchases",
         JOptionPane.INFORMATION_MESSAGE);
      cost = Double.parseDouble(costString);
      JOptionPane.showMessageDialog(null,"With " + TAX * 100 +
         "% tax,  purchase  is $" + (cost + cost * TAX));
   }
}
