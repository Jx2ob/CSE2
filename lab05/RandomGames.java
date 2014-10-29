//JJ O'Brien
//9/24/14
//lab04-RandomGames java program
//
//Program will run one of three different random games depending on user input and will then randomly select an outcome for the 
//game.  Currently only the craps game works so an error comes up for roulette and cards
//
//  First compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames

//create scanner
import java.util.Scanner;

public class RandomGames {
    //main method required
    public static void  main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter R or r for Roulette, ");
        System.out.print("C or c for craps, P or p for ");
        System.out.print("pick a card-");
        if (myScanner.hasNextChar()) {
            char game = myScanner.nextChar();
            
            if (game == R || r) {
                System.out.print("");
            } else if (game == C || c || P || p) {
                System.out.print("Sorry, this game has yet to be implemented");
                return;
            }
            
            
            
        }
        
    }
}    