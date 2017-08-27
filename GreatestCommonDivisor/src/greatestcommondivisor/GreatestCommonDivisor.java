
package greatestcommondivisor;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author tb252
 */
public class GreatestCommonDivisor {

    public static String output ="";
    public static void main(String[] args) {
       //GUI output
        while ( true ){
        int numerator = 
                Integer.parseInt(JOptionPane.showInputDialog("\nEnter first number i.e. 84 as numerator "));
        int denominator = 
                Integer.parseInt(JOptionPane.showInputDialog("\nEnter first number i.e. 180 as denominator "));
      
       //DOS screen
        /*Scanner kybd = new Scanner(System.in);
        System.out.println("\nEnter Numerator and Denominator such as 84 180");
        
        int numerator2 = kybd.nextInt();
        int denominator2 = kybd.nextInt();
        */
        output += "\n The GC of " + numerator + " and " + denominator + " = ";
      while (denominator != 0){
          int rem = numerator % denominator;
          numerator = denominator;
          denominator = rem;
      }  
      output += "\t " + numerator;
      JOptionPane.showMessageDialog(null, output);
    }
    }
}
