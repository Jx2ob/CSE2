//JJ O'Brien
//11/18/14
//hw10 PokerOdds java program
//
//Program randomly generates a poker hand and checks if there is just one pair
//it then displays hand and if user quits then it displays total pairs for each combo 
//out of 10000
//
//  First compile the program
//      javac PokerOdds.java
//  run the program
//      java PokerOdds

import java.util.Random; //random number generator

import java.util.Scanner; //import Scanner 

public class PokerOdds{
  static int deck[] = new int[52]; // array of 52 cards
  static int deckSize = 0;
  static String values[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
      "A", "K", "Q", "J"}; //card position
  
  public static void main(String [] arg){ //main method
    showHands(); //calls method
    simulateOdds(); //calls method
  }
  
  public static void showHands() { //showHands method
    Scanner scan=new Scanner(System.in); //scanner
    String answer=""; //declare answer
    do{ //do-while.
      showOneHand();
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //asks for input
      answer=scan.next();//set answer to scanner
    } while(answer.equals("Y") || answer.equals("y")); //continues loop until quit 
  }
  
  public static void showOneHand() { //showOneHand method
    if (deckSize < 5) {
      for (int i = 0; i < 52; i++) {
        deck[i] = i;
      }
      deckSize = 52;
    }
    int[] cards = getHand(); 
    String clubs = "Clubs:"; //following declares strings
    String diamonds = "Diamonds:";
    String hearts = "Hearts:";
    String spades = "Spades:"; 
    for (int i = 0; i < 5; i++) { //for loop
      int card = cards[i];
      String val = values[card % 13];
      int suit = card / 13;
      if (suit == 0) {
        clubs += " " + val;
      } else if (suit == 1) {
        diamonds += " " + val;
      } else if (suit == 2) {
        hearts += " " + val;
      } else {
        spades += " " + val;
      }
    } 
    System.out.println(clubs); //following outputs values for the stings
    System.out.println(diamonds);
    System.out.println(hearts);
    System.out.println(spades);
  }
  
  public static void simulateOdds() { //simulateOdds method
    int freq[] = new int[13];
    for (int i = 0; i < 13; i++) {
      freq[i] = 0;
    }
    int noPair = 0;
    
    for (int i = 0; i < 10000; i++) { //loop for 10000 times
      if (deckSize < 5) {
        for (int j = 0; j < 52; j++) {
          deck[j] = j;
        }
        deckSize = 52;
      }
      int hand[] = getHand();
      if (oneDuplicate(hand)) {
        int pair = 0;
        for (int a=0; a<5 ; a++) {
          for (int b=(a+1) ; b<5; b++){ 
            if (hand[a] % 13 == hand[b] % 13){
              pair = hand[a] % 13;
            }
          }
        }

        freq[pair]++;
      } else {
        noPair++;
      }
    }
    
    System.out.println("rank\tfreq of exactly one pair"); //output 
    for (int i = 0; i < 13; i++) {
      System.out.printf("%s\t%d\n", values[i], freq[i]);
    }
    System.out.println("total not exactly one pair: " + noPair);
  }
  
  public static boolean oneDuplicate(int num[]){ //evaluates whether just one duplicate
    int count=0;  
    for (int i=0; i<5 ; i++) {
      for (int j=(i+1) ; j<5; j++){ 
        if (num[i] % 13 == num[j] % 13){
          count++;
        }
      }
    }
    return (count==1);//returns true or false
  }
  
  public static int[] getHand() { //shows hand
    int[] cards = new int[5];
    for (int i = 0; i < 5; i++) {
      int r = (int)(Math.random() * deckSize);
      cards[i] = deck[r];
      deckSize--;
      deck[r] = deck[deckSize];
      deck[deckSize] = -1;
    }
    return cards;//returns value for cards
  }
}
