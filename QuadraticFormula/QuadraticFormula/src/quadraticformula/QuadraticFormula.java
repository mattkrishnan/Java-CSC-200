package quadraticformula;
import javax.swing.*;
public class QuadraticFormula {

    
    public static void main(String[] args) {
                String output =" ";
                float numa = Float.parseFloat(JOptionPane.showInputDialog("\nEnter value for a:"));
                float numb = Float.parseFloat(JOptionPane.showInputDialog("\nEnter value for b:"));
                float numc = Float.parseFloat(JOptionPane.showInputDialog("\nEnter value for b:"));
                float disc = ((numb*numb)-(4*numa*numc));
                        if (disc <0){
                            output +="\nThe equation has no real roots";
                        }
                        else if (disc ==0){
                            // Math.sqrt finds the square root
                            double root =(-numb + Math.sqrt(disc))/(2*numa);
                            output +="The equation has one root:" + root;
                            }
                        else {
                            double root1 = (-numb + Math.sqrt(disc))/(2*numa);
                            double root2 = (-numb - Math.sqrt(disc))/(2*numa);
                            output +="The equation has two roots " + root1 + " and " + root2;
                        }
                        JOptionPane.showMessageDialog(null, output);
    }
    
    
}
