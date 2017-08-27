
package factorialvalues;
import java.util.Scanner;
/* Give me everything in the Folder java/util/scanner folder */
public class FactorialValues {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        System.out.println("\n\tEnter any positive number: ");
        int num = kybd.nextInt();
        
        System.out.println("\nThe Number Entered is: " + num);
        long result = 1;
        
        while ( num > 0 ){
            result = result * num;
            num = num -1;
        }
        System.out.println("Its factorial value is: " + result);
 
    }
    
}
