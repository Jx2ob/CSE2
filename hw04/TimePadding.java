//JJ O'Brien
//9/23/14
//hw03-IncomeTax java program
//
//Program asks for seconds left in the day and displays it in a 00:00:00 format
//
//  First compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax

//create scanner
import java.util.Scanner;

public class TimePadding {
    //main method required
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter the time in seconds: "); //asks user for number fo seconds
        int seconds = myScanner.nextInt();
        
        if (seconds>86400 || seconds<0) { //accounts for invalid inputs
            System.out.print("This is not a valid number of seconds");
            return;
        }
        seconds = 86400-seconds;//
        double hours = 0.0;
        double minutes = 0.0;
        
        if (seconds >= 3600) { //sets up hours
            hours = seconds/3600;
        }
        if (seconds > 60) { //sets up minutes
            minutes = seconds/60;
        }
        double seconds2 = seconds % 60; //accounts for seconds in format
        
        System.out.println("The time is   "+ hours + ":" + minutes + ":" + seconds2+".");
        
        
    }
}