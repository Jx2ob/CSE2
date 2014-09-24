//JJ O'Brien
//9/23/14
//hw04-IncomeTax java program
//
//Program asks for income amount and then calculates tax based on income bracket
//
//  First compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax

//create scanner
import java.util.Scanner;

public class IncomeTax {
    //main method required
    public static void  main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter an int giving the number of thousands- ");//ask for inputs
        if (myScanner.hasNextInt()){
             int income = myScanner.nextInt();//declare variable
             
             if (income < 0) {
                 System.out.println("You did not enter a positive int");//for incorrect inputs
             } else {
                System.out.print("The tax rate on $");
                System.out.print(income);
                System.out.print(",000 is ");
                
                int rate;//set up the tax bracket system
                if (income<20){
                    rate = 5;
                } else if (income<40){
                    rate = 7;
                } else if (income<78){
                    rate = 12;
                } else {
                    rate = 14;
                }
                
                System.out.print(rate);
                System.out.print(".0%, and the tax is $");
                
                double tax = income*1000*rate/100;//calculate tax amount
                System.out.println(tax);
             }
        } else {
            System.out.println("You did not enter an int");//for inputs that aren't integer
        }
       
    }
}
