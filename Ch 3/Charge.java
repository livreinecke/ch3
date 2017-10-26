
/**
 * Write a description of class Charge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
 
public class Charge
{
   public static void main (String[] args)
   {
           double prevBalance;  // person's og balance
           double charges;              // amount of the charges
           double interest=0.02;
           double newBalance;          // new balance for person
           double minPayment;
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter your current balance: ");
           prevBalance = scan.nextDouble();
           System.out.print ("Enter your charges: ");
           charges = scan.nextDouble();
 
           // Compute the new balance
           
           newBalance= (prevBalance+charges)+ ((prevBalance+charges)*interest);
           
          
           
           if (newBalance>=300) {
                minPayment = (0.20*newBalance);
            } 
           else if (newBalance>50 && newBalance<300) {
                minPayment = 50;
            }
           else  {
                minPayment = newBalance;
           }
 
           
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous balance:           " + money.format(prevBalance));
           System.out.println("Amount of money you charged: " + money.format(charges));
           System.out.println("Your new balance:          " + money.format(newBalance));
           System.out.println("Your minimum payment due:          " + money.format(minPayment));
           System.out.println();
        }
}
