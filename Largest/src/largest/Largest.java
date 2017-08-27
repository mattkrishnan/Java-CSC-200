/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;
import java.util.Scanner;


/**
 *
 * @author tb252
 */
public class Largest {

    public static void main(String[] args) {
        Scanner kybd = new Scanner(System.in);
        System.out.println("\n\tEnter 3 integer numbers ex. 12 33 21");
        
        int n1 = kybd.nextInt();
        int n2 = kybd.nextInt();
        int n3 = kybd.nextInt();
        System.out.println("\n\tThe Numbers Entered are: " + n1 + " " + n2 + " " + n3);
        int largest=n1;
        if (n2> largest )
            largest = n2;
        if (n3 > largest)
            largest=n3;
        System.out.println("\n\tThe largest number is "+ largest);
    }
    
}
