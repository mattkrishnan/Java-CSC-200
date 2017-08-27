
package russianpeasantmultiplication;
import java.util.Scanner;

public class RussianPeasantMultiplication {

    
    public static void main(String[] args) {
       Scanner kybd = new Scanner(System.in);
       //Asking the user to enter 2 ints and assigning variables
       System.out.println("\n Enter two positive integers to calculate the product e.g. 15 19");
       int n = kybd.nextInt(); 
       int n1 = n; //Necessary for last statement
       int m = kybd.nextInt(); 
       int m1 = m; //Necessary for last statement
       
       long result = 0;
  while ( n > 0 ){
            if (n%2 !=0){
                
                result = result + m;
        }
       n = n / 2;
       m = m * 2;
    }
    System.out.println("\nThe product of " + n1 + " * " + m1 + " = " + result);

}
}