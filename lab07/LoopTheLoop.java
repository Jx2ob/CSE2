//JJ O'Brien
//10/8/14
//lab07-LoopTheLoop java program
//
//Program prompts user to input an int between 1 and 15.  The displays a increasing number of * based on the user's input
//
//  First compile the program
//      javac LoopTheLoop.java
//  run the program
//      java LoopTheLoop

//Create Scanner
import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        
        int nStars;
        int counter;
        
        System.out.print("Enter an int between 1 and 15- "); 
            nStars = s.nextInt();
            counter = nStars;
        
        while(true) {
            
            
            if(counter == 1) {
                System.out.println("*");
                counter++;
            }
            else if(counter == 2) {
                System.out.println("**");
                counter++;
            }
            else if(counter == 3) {
                System.out.println("***");
            }  
            else
                System.out.println("Your int was not in the range [1.15]");
        
        }
        
    }
}