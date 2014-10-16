//JJ O'Brien
//10/14/14
//hw06 Roulette java program
//
//Program 
//
//  First compile the program
//      javac Roulette.java
//  run the program
//      java Roulette

//Create Scanner
//import java.util.Scanner;

public class Roulette {
    public static void main(String args[]) {
        //Scanner s = new Scanner(System.in);
        final int TRIALS = 1000;
        int myNum = 1;
        int prize = 36;
        int trial = 0;
        
        int numLosses = 0;
        int totalWinnings = 0;
        int profitSessions = 0;
        int wins = 0;
        while (trial < 1000) {
            int round = 0;
            int numOfMatches = 0;
            while (round < 100) {
                int spin =  (int) (1 + (Math.random() *  38));
                if (spin == myNum){
                    wins++;
                    numOfMatches++;
                }
                if (round == 99){
                    if (numOfMatches == 0){
                        numLosses++;
                    }
                    else if (numOfMatches >= 3){
                        profitSessions++;
                    }
                }    
               round++;
            }
            trial++; 
        }
        
        System.out.println("The number of times you lose everything is: " + numLosses);
        System.out.println("Your total winnings are: $" + (wins * prize));
        System.out.println("The number of times you walked away with a profit is: " + profitSessions);
    }
}    