//JJ O'Brien
//10/14/14
//hw06 -Root java program
//
//Program asks user to input a number greater than 0 and then solves for the square root of that number
//
//  First compile the program
//      javac Root.java
//  run the program
//      java Root

//Create Scanner
import java.util.Scanner;

public class Root {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a double that is greater than 0:  "); //asks for input
        double x = s.nextDouble();
        if (x <= 0) {
            System.out.println("You must enter a number greater than 0"); //for numbers that do not fit criteria
        } else {
            double low = 0.0; //declares variables
            double high = (x + 1);
            double difference = high - low;
            double tolerance = .0000001 * (high);
            double middle = (low + high) / 2;

            while (difference > tolerance) { //sets up loop
                if (middle * middle > x) {
                    high = middle;
                }
                else {
                    low = middle;
                }
                difference = high - low;
                middle = (low + high) / 2; // solves for aquare root
            }
       
            System.out.println("The square root of the number is: " + middle); // output for root
        }
    }
    
    
}    