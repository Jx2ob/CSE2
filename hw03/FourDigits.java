//JJ O'Brien
//9/16/14
//hw03-FourDigits java program
//
//  First compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits
//  Program tells user to enter a double then prints the first four digits to the right of the decimal point

//  set up scanner
import java.util.Scanner;
//  define a class
public class FourDigits {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double myNumber=myScanner.nextDouble();
        
        int Cast=(int)(myNumber); //turn number into an integer
        double result;  //make result a variable
        result=myNumber-Cast;   //calculate the result
        result*=10000;
        int castCast=(int)(result); //turns the number into an integer
        
        System.out.printf("The four digits are "+castCast+"%n");
        
    }
}