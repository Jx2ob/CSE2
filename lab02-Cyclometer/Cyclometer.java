//JJ O'Brien
//9/3/14
//lab02-Cyclometer java program
//
//  First compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

//  define a class

public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        int secsTrip1=480;  // number of seconds trip 1 took
        int secsTrip2=3220;  // number of seconds trip 2 took
        int countsTrip1=1561;  // number of rotations during trip 1
        int countsTrip2=9037;  // number of rotations during trip 2
        
        double wheelDiameter=27.0;  // diameter of bicycle wheel
        double PI=3.14159;  // Value of PI
        double feetPerMile=5280;  // Number of feet in a mile
        double inchesPerFoot=12;  // Number of inches in a foot
        doublesecondsPerMinute=60;  // Number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;  // **********
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");  
        
        //run the calculations; store the values. Document your
        //calculations here. What are you calculating?*********
        //
        //
    distanceTrip1=countsTrip1*wheeldiameter*PI;
    //above gives distance in inches
    //(for each count, a rotation of the wheel travels
    // the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    
        //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    }   //end of main method
}   //end of class