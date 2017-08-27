
package hailstone;
import java.util.Scanner;
/*@author Tushar Balarajan
 */
public class Hailstone {

    
    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
                 System.out.println("\n Enter a positive number");
                 
                 int number = kybd.nextInt();
                 int oddnumber;
                 int evennumber;
                 while ( number !=1){
                 
                 while (number %2 !=0){
                     oddnumber = 3 * number + 1;
                     System.out.println( number + "\t is odd, so I make 3n+1:\t" + oddnumber);
                     number = oddnumber;
                }                  
                    evennumber = number /2;
                    System.out.println(number + "\t is even, so I take half:\t" + evennumber);
                    number = evennumber;
    }
    }
}
