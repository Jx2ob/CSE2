//JJ O'Brien
//12/5/14
//hw11 PokerHands java program
//
//Program asks user for the suit and level of 5 canrds and then tells user what the best hand they have is.

//  First compile the program
//      javac PokerHands.java
//  run the program
//      java PokerHands
//

import java.util.Scanner;//set scanner
import static java.util.Arrays.*;                                               
public class PokerHands{                                                       
    public static void main(String[] args){//main method                                    
        Scanner scan = new Scanner(System.in);                                  
        int[] hand = new int[5];                                               
        for(int i=0; i<5; i++)hand[i]=-1;   
        
        while(true){ //always loop                                                           
            
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");//asks user for input
            String input = scan.next(); 
            if(!input.equals("Y") && !input.equals("y")){
                break;
            }              
            
            hand = fill(hand);                                                 
            display(hand);                                                     
            evaluate(hand);                                                     
            for(int i=0; i<5; i++){
                hand[i]=0;   
            }
        }
        
    }
    
    public static int[] fill(int[] hand){//fill method, asks for all of the inputs                                  
        Scanner scan = new Scanner(System.in);                                  
        String input_suit;                                                      
        
        String input_card;                                                      
        int output_card = 0;                                                    
        int i=0;                                                               
        
        while(true){                                                       
            
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
            input_suit = scan.next();
            
            
            if(!input_suit.equals("c") && !input_suit.equals("d") && !input_suit.equals("h") && !input_suit.equals("s")){
                System.out.println("You did not enter a valid response.");     
                continue;
            }
            switch(input_suit){                                                 
                case "c": output_card = 0;  break;
                case "d": output_card = 13; break;
                case "h": output_card = 26; break;
                case "s": output_card = 39; break;
                default: System.out.println("You did not enter a valid response");
                
            }
            
            
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            input_card = scan.next();
            switch(input_card){                                                 
                case "a": output_card += 0;break;
                case "k": output_card += 1;break;
                case "q": output_card += 2;break;
                case "j": output_card += 3;break;
                case "9": output_card += 5;break;
                case "8": output_card += 6;break;
                case "7": output_card += 7;break;
                case "6": output_card += 8;break;
                case "5": output_card += 9;break;
                case "4": output_card += 10;break;
                case "3": output_card += 11;break;
                case "2": output_card += 12;break;
                default:    
                    if(input_card.equals("10")){
                        output_card = 4;
                        break;
                    }
                    System.out.println("You did not enter a valid response.");
                    continue;
            }
            
            if (element(output_card, hand)){
                System.out.println("You already entered that card.");
                continue;
            }
            else{
                hand[i] = output_card;
            }
        
        
            i++;                                                               
            if(i == 5){
                return hand;  
            }   
        }
    }
    
    public static Boolean element(int card, int[] hand){//element method
        for (int i=0;i<hand.length;i++){
            if(hand[i] == card){
                return true;
            }    
        }
        return false;
    }
    
    public static void display(int[] hand){// display method
        System.out.print("Clubs-     ");
        for(int i: hand){
            if(i/13 == 0){
                System.out.print(toCard(i%13) + " ");
                System.out.println();
            }    
        }    
        
        System.out.print("Diamonds-  ");
        for(int i: hand){
            if(i/13 == 1){
                System.out.print(toCard(i%13) + " ");
                System.out.println();
            }
        }    
        System.out.print("Hearts-    ");
        for(int i: hand){
            if(i/13 == 2){
                System.out.print(toCard(i%13) + " ");
                System.out.println();
            }
        }    
        System.out.print("Spades-    ");
        for(int i: hand){
            if(i/13 == 3){
                System.out.print(toCard(i%13) + " ");
                System.out.println();
            }
        }    
        
    }
    
    public static String toCard(int input){
        switch(input){
            case 0: return "A";
            case 1: return "K";
            case 2: return "Q";
            case 3: return "J";
            case 4: return "10";
            case 5: return "9";
            case 6: return "8";
            case 7: return "7";
            case 8: return "6";
            case 9: return "5";
            case 10: return "4";
            case 11: return "3";
            case 12: return "2";
            default: return "You did not enter a valid response.";
        }
    }
    
    public static void evaluate(int[] hand){//evaluate method
        
        System.out.print("This is a ");
        
        int[] suits = new int[4];
        for(int i=0;i<4; i++){
             suits[i]=0;         
        }
        int[] reps  = new int[13];
        for(int i=0;i<13; i++){
            reps[i]=0;         
        }    
        
        for (int i: hand){                                                    
            suits[ i/13 ]++;
            reps [ i%13 ]++;
        }
        
        for(int i=0; i<5; i++){
            hand[i] %= 13;
        }    
            sort(hand);                                                            
        
        int number_of_suits = 0;
        for(int i: suits)if(i != 0){
            number_of_suits++;                           
        }
        if (number_of_suits == 1){                                              
            if( element(0, hand) && element(1, hand) && element(2, hand) && element(3, hand) && element(4, hand)){
                System.out.println("");
                System.out.println("");
                System.out.println("Royal Flush\n-------------------------"); return;
            }
            else if ((hand[0] + 1 == hand[1]) && (hand[1] + 1 == hand[2]) && (hand[2] + 1 == hand[3]) && (hand[3] + 1 == hand[4])){ 
                System.out.println("");
                System.out.println("");
                System.out.println("Straight Flush\n-------------------------"); return;
            }
            else { 
                System.out.println("");
                System.out.println("");
                System.out.println("Flush\n-------------------------");
                return;
            }
        }
        
        if ((hand[0] == hand[1] + 1) && (hand[1] == hand[2] + 1) && (hand[2] == hand[3] + 1) && (hand[3] == hand[4] + 1)){
            System.out.println("");
            System.out.println("");
            System.out.println("Straight\n-------------------------");
            return;
        }
        
        if (element(4, reps)){
            System.out.println("");
            System.out.println("");
            System.out.println("Four of a kind\n-------------------------");
            return;
        }
        if (element(3, reps) && element(2, reps)){ 
            System.out.println("");
            System.out.println("");
            System.out.println("Full House\n-------------------------");
            return;
        }
        int pairs = 0;
        for (int i=0; i<13; i++){
            if(reps[i] == 2){
                pairs++;
            }
        }    
        
        if(pairs == 2){ 
            System.out.println("Two Pairs\n-------------------------");
            return;
        }
        else if( pairs == 1){ 
            System.out.println("One Pair\n-------------------------");
            return;
        }
        System.out.println("");
        System.out.println("");
        System.out.println("High card\n-------------------------");             
    }
}
