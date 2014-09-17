//JJ O'Brien
//9/16/14
//hw03-Root java program
//
//  First compile the program
//      javac Root.java
//  run the program
//      java Root
//  Program computes cubed root of imput throught guesses

//  set up scanner
import java.util.Scanner;

//  define a class
public class Root {
    //main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a double and the program will print its cube root - ");
        double myNumber=myScanner.nextDouble();
        
        //Initialize variables
        double crude;
        double root;
        
        //Perform calculations
        crude=myNumber/3.0;
        crude=(2*crude*crude*crude+myNumber)/(3*crude*crude);
        crude=(2*crude*crude*crude+myNumber)/(3*crude*crude);
        crude=(2*crude*crude*crude+myNumber)/(3*crude*crude);
        crude=(2*crude*crude*crude+myNumber)/(3*crude*crude);
        crude=(2*crude*crude*crude+myNumber)/(3*crude*crude);
        
        //Print results
        System.out.println("The cube root is "+crude+" : "+crude+"*"+crude+"*"+crude);
        System.out.println("="+crude*crude*crude);
    }
}