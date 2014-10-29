//JJ O'Brien
//9/17/14
//lab04-BigMacAgain java program
//
//Program asks user for his/her Big Mac order and outputs the price and then
//asks the user if he/she would like to add fries and calculates the cost of 
//the fries and totals the order cost.  Program forces user to use an int and 
//certain inputs to recive the correct answer or else is tells user to enter again

//  First compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain

//  set up scanner
import java.util.Scanner;
//  define a class
public class BigMacAgain{
    //main method required for every java program
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the number of Big Macs: ");
        int myNumber=myScanner.nextInt();
        
        if(myScanner.hasNextInt());
        else{
        System.out.println("You did not enter an int");
        return;     //leaves the program
                        //program terminates
        }
        
        
        System.out.printf("You ordered "+myNumber+"%n" "Big Macs for a cost of "+myNumber+"%n""x2.22 = ");
        
    }   //end of main method
}   //end of class