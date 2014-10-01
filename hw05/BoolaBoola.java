//JJ O'Brien
//9/30/14
//hw04-BoolaBoola java program
//
//Program randomly assigns values to three boleans and prompts the user to determine whether statement is true or false 
//based on logical operators
//
//  First compile the program
//      javac BoolaBoola.java
//  run the program
//      java BoolaBoola

//create random and scanner
import java.util.Random;
import java.util.Scanner;

public class BoolaBoola {
    //main method required
     public static void main(String args[]) {
          Random r;
          r = new Random();
          Scanner s;
          s = new Scanner(System.in);
          boolean[] bools = new boolean[3];
          boolean[] ops = new boolean[2];
          String op1;
          String op2;
          boolean correct; //keeps track of whether or not the user's guess is correct
          
          while(true) {
               op1 = op2 = "||"; //reset the strings to || each time through the loop
               correct = false;
               for(int i = 0; i < 3; i++) {
                    bools[i] = r.nextInt(2) != 0; //if random number is 0, it's false. if it's 1, it's true
               }
               for(int i = 0; i < 2; i++) {
                    ops[i] = r.nextInt(2) != 0;
               }
               if(ops[0] == true) op1 = "&&"; //for printing out || or && in below println statement
               if(ops[1] == true) op2 = "&&";
               
               System.out.println("Does " + bools[0] + " " + op1 + " " + bools[1] + " " + op2 + " " + bools[2] + " have the value true (t/T) or false (f/F)?");
               String line = s.nextLine();
               boolean guess = false; //keeps track of what user enters
               if(line.equals("t") || line.equals("T")) {
                    guess = true;
               } else if(line.equals("f") || line.equals("F")) {
                    guess = false;
               } else {
                    guess = false;
               }
               
               if(ops[0] == false && ops[1] == false) { //if the random chose || and ||
                    if(bools[0] || bools[1] || bools[2] == guess) correct = true;
               } else if(ops[0] == false && ops[1] == true) { //if the random chose || and &&
                    if(bools[0] || bools[1] && bools[2] == guess) correct = true;
               } else if(ops[0] == true && ops[1] == false) { // && and ||
                    if(bools[0] && bools[1] || bools[2] == guess) correct = true;
               } else if(ops[0] == true && ops[1] == true) { // && and &&
                    if(bools[0] && bools[1] && bools[2] == guess) correct = true;
               }
               
               if(correct == true) {
                    System.out.println("Correct");
               } else {
                    System.out.println("Wrong; try again"); 
               }
          }
     }
}