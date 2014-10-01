//JJ O'Brien
//9/23/14
//hw05-BurgerKing java program
//
//Program 
//
//  First compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing

//create scanner
import java.util.Scanner;

public class BurgerKing {
     public static void main(String args[]) {
          Scanner s; 
          s = new Scanner(System.in);
          String line;
          
          while(true) {
               System.out.println("Enter a letter to indicate a choice of");
               System.out.println("\tBurger (B or b)");
               System.out.println("\tSoda (S or s)");
               System.out.println("\tFries (F or f)");
               line = s.nextLine();
               
               if(line.equals("B") || line.equals("b")) {
                    System.out.println("Enter A or a for \"all the fixins\"");
                    System.out.println("C or c for cheese");
                    System.out.println("N or n for none of the above");
                    String newLine = s.nextLine();
                    if(newLine.equals("A") || newLine.equals("a")) {
                         System.out.println("You ordered a burger with all the fixins");
                    } else if(newLine.equals("C") || newLine.equals("c")) {
                         System.out.println("You ordered a burger with cheese");
                    } else if(newLine.equals("N") || newLine.equals("n")) {
                         System.out.println("You ordered a plain burger");
                    } else {
                         System.out.println("Invalid input");
                    }
               } else if(line.equals("S") || line.equals("s")) {
                    System.out.println("Do you want Pepsi (P or p),");
                    System.out.println("Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)?");
                    String newLine = s.nextLine();
                    if(newLine.equals("P") || newLine.equals("p")) {
                         System.out.println("You ordered a Pepsi");
                    } else if(newLine.equals("C") || newLine.equals("c")) {
                         System.out.println("You ordered a Coke");
                    } else if(newLine.equals("S") || newLine.equals("s")) {
                         System.out.println("You ordered a Sprite");
                    } else if(newLine.equals("M") || newLine.equals("m")) {
                         System.out.println("You ordered a Mountain Dew");
                    } else {
                         System.out.println("Invalid input");
                    }
               } else if(line.equals("F") || line.equals("f")) {
                    System.out.println("Do you want a large or small order of fries (l, L, s, or S)?");
                    String newLine = s.nextLine();
                    if(newLine.equals("L") || newLine.equals("l")) {
                         System.out.println("You ordered a small fries");
                    } else if(newLine.equals("S") || newLine.equals("s")) {
                         System.out.println("You ordered a large fries");
                    } else {
                         System.out.println("Invalid input");
                    }
               } else if(line.length() > 1) {
                    System.out.println("Single character expected");
               } else {
                    System.out.println("You did not enter any of B, b, S, s, F, or f");
               }
          }
     }
}