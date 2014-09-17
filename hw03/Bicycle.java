//JJ O'Brien
//9/16/14
//hw03-Bicycle java program
//
//  First compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle

//create scanner
import java.util.Scanner;
//define a class
public class Bicycle {
    //main method required for every java program
        public static void main(String[] args) {
            Scanner myScanner;
            myScanner = new Scanner(System.in);
            System.out.print("Enter the number of seconds:");
            int nSeconds=myScanner.nextInt();
            System.out.print("Enter the number of counts:");
            int nCounts=myScanner.nextInt();
            
            //Declare variables
            double wheelDiameter=27.0;  // diameter of bicycle wheel
            double PI=3.14159;  // Value of PI
            double feetPerMile=5280;  // Number of feet in a mile
            double inchesPerFoot=12;  // Number of inches in a foot
            double secondsPerMinute=60;  // Number of seconds in a minute
            double minutesPerHour=60;   //Minutes in an hour
            double distance;
            double minutes;
            double avgmph;
            
            //Initialize variables
            distance=0.0;
            minutes=0.0;
            avgmph=0.0;
            
            //run calculations
            distance=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            minutes=nSeconds/secondsPerMinute;
            avgmph=distance/(minutes/minutesPerHour);
            
            //Print out the output data
            System.out.printf("The distance was %2.2f miles and took %2.2f minutes %n", distance, minutes);
            System.out.printf("The average mph was %2.2f %n", avgmph);
        }
}