/////
//JJ O'Brien
//hw02
//Arithmetic Java Program
//
//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
public class Arithmetic{
    
    //  add main method
    public static void main(String[] args) {
        //  add assumptions
        int nSocks=3;   //Number of pairs of socks
        double sockCost$=2.58;  //Cost per pair of socks ('$' is part of the variable name)
        
        int nGlasses=6; //Number of drinking glasses
        double glassCost$=2.29; //Cost per glass
        
        int nEnvelopes=1;   //Number of boxes of envelopes
        double envelopeCost$=3.25;  //cost per box of envelopes
        double taxPercent=0.06; //tax
        
        //Initialize the variables
        double totalSockCost$=0.0;
        double socksSalesTax$=0.0;
        double totalGlassCost$=0.0;
        double glassesSalesTax$=0.0;
        double totalEnvelopeCost$=0.0;
        double envelopeSalesTax$=0.0;
        double totalSalesTax$=0.0;
        double totalCostBeforeTax$=0.0;
        double totalCostAfterTax$=0.0;
        
        //Compute Calculations
        totalSockCost$=nSocks*sockCost$; //total cost of socks
        socksSalesTax$=totalSockCost$*taxPercent;    //total sales tax of socks
        totalGlassCost$=nGlasses*glassCost$;    //total cost of glasses
        glassesSalesTax$=totalGlassCost$*taxPercent;    //total sales tax of glasses
        totalEnvelopeCost$=nEnvelopes*envelopeCost$;    //total cost of envelopes
        envelopeSalesTax$=totalEnvelopeCost$*taxPercent;    //total sales tax of envelopes
        totalSalesTax$=socksSalesTax$+glassesSalesTax$+envelopeSalesTax$;  //total sales tax of purchase
        totalCostBeforeTax$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$; //total cost of purchase before tax
        totalCostAfterTax$=totalCostBeforeTax$+socksSalesTax$+glassesSalesTax$+envelopeSalesTax$;   //total cost after tax
        
        
        //Print out answers
        System.out.printf("The total pretax cost of socks is $%2.2f %n", totalSockCost$);
        System.out.printf("The sales tax of the socks is $%2.2f %n", socksSalesTax$);
        System.out.printf("The total pretax cost of glasses is $%2.2f %n", totalGlassCost$);
        System.out.printf("The sales tox of the glasses is $%2.2f %n", glassesSalesTax$);
        System.out.printf("The total pretax cost of envelopes is $%2.2f %n", totalEnvelopeCost$);
        System.out.printf("The sales tax of the envelopes is $%2.2f %n", envelopeSalesTax$);
        System.out.printf("The total cost of purchases before tax is $%2.2f %n", totalCostBeforeTax$);
        System.out.printf("The total cost of the purchase including sales tax is $%2.2f %n", totalCostAfterTax$);
    }
}