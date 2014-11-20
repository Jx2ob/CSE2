//JJ O'Brien
//11/18/14
//hw10 FindDuplicates java program
//
//Program determines whether a list of integers contains exactly one and at least one duplicates in the input
//
//  First compile the program
//      javac FindDuplicates.java
//  run the program
//      java FindDuplicates

import java.util.Scanner; //input scanner

public class FindDuplicates { 
  public static void main(String [] arg){ //main method
    Scanner s = new Scanner(System.in); //user input
    int num[] = new int[10]; // array
    String answer="";
    do{
      System.out.print("Enter 10 ints- "); //asks for input
      for(int j=0;j<10;j++){ //for loop
        num[j] = s.nextInt(); //checks for each number in group
      }
      String out="The array "; //output
      out+=listArray(num); //return a string of the form "{2, 3, -9}"
      if(hasDups(num)){ //loop calls "hasDups"
        out+="has "; //output
      }
      else{
        out+="does not have "; //output
      }
      out+="duplicates."; 
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has "; 
        //all the above prints output
      }
      else{
        out+="does not have "; //output
      }
      out+="exactly one duplicate.";
      System.out.println(out);
      System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer = s.next();
    }while(answer.equals("Y") || answer.equals("y")); // loop condition
  }

  public static String listArray(int num[]){ //listArray method
    String out="{";
    for(int j=0;j<num.length;j++){ //for loop
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out; //returs value of out
  }
  public static boolean hasDups(int num[]){ //hasDups method
    for (int a=0; a<10 ; a++) {
      for (int b=(a+1) ; b<10; b++){ 
        if (num[a] == num[b]){
          return true; //returns true is condition is met
        }
      }
    }
    return false; //returns false if not met
  }


  public static boolean exactlyOneDup(int num[]){//exactlyOneDup method
    int d=0;  
    for (int a=0; a<10 ; a++) {
      for (int b=(a+1) ; b<10; b++){ 
        if (num[a] == num[b]){
          d = d + 1;
        }
      }
    }
    return (d==1); //returns true if value of d is 1
  }
}
