//JJ O'Brien
//10/28/14
//hw08 HW8 java program
//
//Program forces user for a c or C to continue then asks user for y, Y, N, n then 
//asks user to enter a digit between 0 and 9 and tells user the digit they entered
//
//  First compile the program
//      javac HW8.java
//  run the program
//      java HW8

import java.util.Scanner;// set up scanner

public class HW8{//set up main method
    public static void main(String [] arg){
        char input;
    	Scanner scan=new Scanner(System.in);
    	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");//asks for first group of inputs
    	input=getInput(scan,"Cc");
    	System.out.println("You entered '"+input+"'");
    	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");//asks user to enter a y, Y, N, or n
    	input=getInput(scan,"yYnN",5); //give up after 5 attempts
    	if(input!=' '){
       	System.out.println("You entered '"+input+"'");
    	}
    	input=getInput(scan,"Choose a digit.","0123456789");//prompts user to enter a digit
    	System.out.println("You entered '"+input+"'");
    }
    
    public static char getInput(Scanner s, String p, int n){//method for the yes no part
        for(int i = 0 ;  i < n ; i++){
            String input = s.next();
            if (input.length() != 1) {
                System.out.print("You should enter exactly one character- ");//response when user input is more than one digit
            } else {
                char c = input.charAt(0);
                for(int j = 0; j < p.length(); j++){
                    if(p.charAt(j) == c) {
                        return c;
                    }
                }
                System.out.printf("You did not enter a character from the list '%s'; try again- ", p);//response for inputs that are unnacceptable
            }
        }
        System.out.printf("You failed after '%s' tries\n", n);// response after a certain number of tries
        return ' ';
    }
    
    public static char getInput(Scanner s, String p){//method for the continue part
        return getInput(s, p, 9999);
    }
    
    public static char getInput(Scanner s, String prompt, String p) {//method for the digit part
        while(true){
            System.out.println(prompt);
            
            System.out.print("Enter one of: ");//response change from above
            for (int i = 0; i < p.length(); i++) {
                System.out.printf("'%s'", p.charAt(i));
                if (i < p.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("- ");
            
            
            String input = s.next();
            if (input.length() != 1) {
                System.out.println("Enter exactly one character");//response change from above
            } else {
                char c = input.charAt(0);
                for(int j = 0; j < p.length(); j++){
                    if(p.charAt(j) == c) {
                        return c;
                    }
                }
                System.out.println("You did not enter an acceptable character");//response change from above
            }
        }
    }
    
}
