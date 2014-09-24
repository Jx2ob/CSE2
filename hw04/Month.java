//JJ O'Brien
//9/23/14
//hw04-Month java program
//
//Program asks for the month as an integer and tells user how many days are in the month
//for Ferurary the program then asks for the year and calculates whether it is a leap year or not and tells how many days 
//
//  First compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax

//create scanner
import java.util.Scanner;

public class Month {
    //main method required
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter an int giving the number of the month (1-12)- ");//asks for the month as an integer
        if (myScanner.hasNextInt()){
            int month = myScanner.nextInt();
            
            //Depending on the integer the user input, the porgram goes through and outputs the number of days
            if (month == 1) {
                System.out.println("The month has 31 days");
            }else if (month == 2) {
                System.out.print("Enter an int giving the year ");
                int year = myScanner.nextInt();//for february, the program asks for the year and then calculates if it is a leap year
                if (year % 4 != 0) { //condition for a leap year
                    System.out.println("The month has 28 days");
                } else if (year % 100 != 0) { //condition for a leap year
                    System.out.println("The month has 29 days");
                } else if (year % 400 != 0) { //condition for a leap year
                    System.out.println("The month has 28 days");
                } else {
                    System.out.println("The month has 29 days");
                }
            }else if (month == 3) {
                System.out.println("The month has 31 days");
            }else if (month == 4) {
                System.out.println("The month has 30 days");
            }else if (month == 5) {
                System.out.println("The month has 31 days");
            }else if (month == 6) {
                System.out.println("The month has 30 days");
            }else if (month == 7) {
                System.out.println("The month has 31 days");
            }else if (month == 8) {
                System.out.println("The month has 31 days");
            }else if (month == 9) {
                System.out.println("The month has 30 days");
            }else if (month == 10) {
                System.out.println("The month has 31 days");
            }else if (month == 11) {
                System.out.println("The month has 30 days");
            }else if (month == 12) {
                System.out.println("The month has 31 days");
            }else
                System.out.println("You did not enter an int between 1 and 12");//answer for all inputs besides 1-12
            } 
        }
}