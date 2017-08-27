package hailstonegui;

/**
 *
 * @author Tbalarajan
 */
import java.util.*;
import javax.swing.*;
public class HailstoneGUI {
    public static String output ="";
    public static void main(String[] args) {
        int number = 
                Integer.parseInt(JOptionPane.showInputDialog("\nEnter a positive integer: "));
        int oddnumber;
        int evennumber;
        
            while ( number !=1){
                
                while (number %2 !=0){
                     oddnumber = 3 * number + 1;
                     //output = number + "\t is odd, so I make 3n+1:\t" + oddnumber;
                     number = oddnumber;
                     JOptionPane.showMessageDialog(null, output);
                }
                evennumber = number /2;
                output = number + "\t is even, so I take half:\t" + evennumber;
                number = evennumber;
                JOptionPane.showMessageDialog(null, output);
            }
            
    }
    
}
