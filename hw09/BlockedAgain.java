//JJ O'Brien
//11/4/14
//hw09 BlockedAgain java program
//
//Program asks user to input an integer between 1 and 9 then uses a systme of methods to first 
//determine whether the input fits within the constraint and then prints uses a loop to create 
//a triangle made up of increasing numbers and with lines between each set of numbers
//
//  First compile the program
//      javac BlockedAgain.java
//  run the program
//      java BlockedAgain

import java.util.Scanner; //set up scanner
public class BlockedAgain{//main method
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
    
    public static int getInt() { //first getInt method.
        Scanner scan = new Scanner(System.in); //scanner input
        System.out.print("Enter an integer that is between 1 and 9, inclusive- ");//prompts user to enter integer
        while (true) { //create while loop
            if (checkInt(scan)) {
                int n = scan.nextInt();//variable n is the scanner input
                if (checkRange(n) != 0) { 
                    return n;//returns n for the method.
                }
                else {
                    System.out.print("You did not enter an integer between 1 and 9, try again- ");//output if integer is not within the range
                }
            }
            else {
                scan.next();
                System.out.print("You did not enter an integer, try again- ");//output if the input was not an integer
            }
        }
    }
    
    public static boolean checkInt(Scanner scanner) {//method to check if input is an integer
        return scanner.hasNextInt();//uses a boolean to check for an integer
    }
    
    public static int checkRange(int n) {//method to see if the input is within the range
        if (n >= 1 && n <= 9) {//between 1 and 9
            return n;//returns the input as the variable n
        }
        else
            return 0;//returns 0 the input as a 0
    }

    public static void allBlocks(int n) {//allBlocks method 
        for (int i = 1; i <= n; i++) {
            block(i, n - i);
        }
    }
    
    public static void block(int x, int col) {//block method
        for (int i = 0; i < x; i++) {
            row(Integer.toString(x).charAt(0), x, col);//indents the numbers.
        }
        row('-', x, col); 
    }
    
    public static void row(char c, int x, int col) {//creates lines
        for (int i = 0; i < col; i++) {
            System.out.print(" "); //out puts space
        }
        for (int i = 0; i < x * 2 - 1; i++) {
            System.out.print(c);//out puts variable c
        }
        System.out.println();//new line
    }
}
        
   