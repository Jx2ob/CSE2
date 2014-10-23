//JJ O'Brien
//10/21/14
//hw07 NumberStack java program
//
//Program prompts user to enter an int between 1 and 9 and prints out three separate 
//stacks of numbers that incrementaly increase using for loops for the first set,
//while loops for the second set, and do-while loops for the third
//
//  First compile the program
//      javac NumberStack.java
//  run the program
//      java NumberStack

import java.util.Scanner;// set up scanner

public class NumberStack{//set up main method
    public static void main(String [] arg){
        Scanner s = new Scanner(System.in);
    
        System.out.println("Enter a number between 1 and 9-  ");//asks for input from user 
        if (s.hasNextInt()){//checks for an integer
            int num = s.nextInt();//declare variables
            if (1 <= num && num<=9){//checks for an int between 1 and 9
    
                System.out.println("Using for loops:");//begins first set
                int temp0 = num;
        
                for(int i=1; i<=temp0; i++){//first loop
                    for(int j=0; j<i; j++){//second loop
                        if(j!=0){
                            System.out.println();
                        }
                        for(int k=0; k<((2*i)-1); k++){//third loop
                            System.out.print(i);
                        }
                    }
                    System.out.println();
        
                    for(int l=0; l<((2*i)-1); l++){//fourth loop
                        System.out.print("-");
                    }
                    System.out.println();
                }   
    
                System.out.println();//end first set
                System.out.println("Using while loops:");//begin second set
                
                int i = 1;
                while(i<=temp0){//first loop
                    int j = 0;
                    while(j<i){//second loop
                        if(j!=0){
                            System.out.println();
                        }
                        int k = 0;
                        while(k<((2*i)-1)){//third loop
                            System.out.print(i);
                            k++;
                        }
                        j++;
                    }
                    System.out.println();
        
                    int l = 0;
                    while(l<((2*i)-1)){//fourth loop
                        System.out.print("-");
                        l++;
                    }
                    System.out.println();
                    i++;
                }
                
                System.out.println("Using do-while loops:");//begin third set
                
                i = 1;
                do {//first loop
                    int j = 0;
                    do {//second loop
                        if(j!=0){
                            System.out.println();
                        }
                        int k = 0;
                        do {//third loop
                            System.out.print(i);
                            k++;
                        } while(k<((2*i)-1));
                        j++;
                    } while(j<i);
                    System.out.println();
        
                    int l = 0;
                    do {//fourth loop
                        System.out.print("-");
                        l++;
                    }while(l<((2*i)-1));
                    System.out.println();
                    i++;
                } while(i<=temp0);
    
            } else {
                System.out.println("You did not enter a number between 1 and 9. Not Cool.");//response for a number not between 1 and 9
                return;//ends program
            }
            
        } else {
            System.out.println("You did not enter a number between 1 and 9. Not Cool.");//response for a none integer
            return;//ends program
        }
    }
}    