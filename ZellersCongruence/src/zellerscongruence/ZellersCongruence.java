package zellerscongruence;
//@author Tushar Balarajan
import javax.swing.*;
public class ZellersCongruence {
    public static int Equation(int y, int m, int dm, int c, int yc){
        int d = ((dm + ((26 * (m + 1))/10)+ yc + (yc/4) + (c/4) + (5*c))%7);
        return(d);
    }
    public static String output = "";

    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("\nEnter year: (e.g., 2012): "));
        int month = Integer.parseInt(JOptionPane.showInputDialog("\nEnter month: 1-12: "));
        int daymonth = Integer.parseInt(JOptionPane.showInputDialog("\nEnter the day of the month: 1-31: "));
        
        if (month < 3){
            month = month + 12;
            year = year - 1;
        }
        int century = year / 100;
        int yearofcentury = year % 100;
        
        /* int day = ((daymonth + ((26 * (month + 1))/10)+ yearofcentury + (yearofcentury/4) + (century/4) + (5*century))%7);
           used to refine equation
        */
        
        int day = Equation(year, month, daymonth, century, yearofcentury);
        
        switch (day){
            case 0 :    output ="\nDay of the week is Saturday.";
                        break;
            case 1 :    output ="\nDay of the week is Sunday.";
                        break;           
            case 2 :    output ="\nDay of the week is Monday.";
                        break;           
            case 3 :    output ="\nDay of the week is Tuesday.";
                        break;           
            case 4 :    output ="\nDay of the week is Wednesday.";
                        break;           
            case 5 :    output ="\nDay of the week is Thursday.";
                        break;           
            case 6 :    output ="\nDay of the week is Friday.";
                        break;
            default :   output ="\nSomething went wrong!";
                        break;                                                                                                    
        }
        /* output = "Test answer: " + day; 
        used to test algorithm before I tested switch statement
        */
        JOptionPane.showMessageDialog(null, output);        
    }    
}
