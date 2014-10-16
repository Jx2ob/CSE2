//JJ O'Brien
//10/14/14
//hw06 Roulette java program
//
//Program is a monte Carlo simulation that checks the probability of winning roulette in 1000 different 100 spin situations
//
//  First compile the program
//      javac Roulette.java
//  run the program
//      java Roulette


public class Roulette {
    public static void main(String args[]) {
        final int TRIALS = 1000; //set up variables
        int myNum = 1;
        int prize = 36;
        int trial = 0;
        
        int numLosses = 0;
        int totalWinnings = 0;
        int profitSessions = 0;
        int wins = 0;
        while (trial < 1000) { // set up loop
            int round = 0;
            int numOfMatches = 0;
            while (round < 100) { //set up second loop
                int spin =  (int) (1 + (Math.random() *  38));
                if (spin == myNum){ // records wins
                    wins++;
                    numOfMatches++;
                }
                if (round == 99){ // records losses
                    if (numOfMatches == 0){
                        numLosses++;
                    }
                    else if (numOfMatches >= 3){ //records times with profit
                        profitSessions++;
                    }
                }    
               round++;// continues loop
            }
            trial++; // continues loop
        }
        
        System.out.println("The number of times you lose everything is: " + numLosses);// prints out answers
        System.out.println("Your total winnings are: $" + (wins * prize));
        System.out.println("The number of times you walked away with a profit is: " + profitSessions);
    }
}    