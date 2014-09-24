//JJ O'Brien
//9/23/14
//hw03-IncomeTax java program
//
//asks for course number in the form of a six digit number between a range, then tells which semester the course was offered
//
//  First compile the program
//      javac IncomeTax.java
//  run the program
//      java IncomeTax

//create scanner
import java.util.Scanner;

public class CourseNumber {
    //main method required
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a six digit number giving the course semester- "); //ask for six digit number
        int courseNumber = myScanner.nextInt();
        
        if (courseNumber<186510 || courseNumber>201440) { //accounts for numbers outside of range
            System.out.println("The number was outside the range [186510,201440]");
        } else {
            int year = courseNumber / 100;
            int semester = courseNumber % 100;
            if (semester == 40) { //fall courses
                System.out.println("The course was offered in the Fall Semester of " + year);
            } else if (semester == 30) { //summer 2
                System.out.println("The course was offered in the Summer 2 semester of " + year);
            } else if (semester == 20) { //summer 1
                System.out.println("The course was offered in the Summer 1 semester of " + year);
            } else if (semester == 10) { //spring
                System.out.println("The course was offered in the Spring semester of " + year);
            } else {
                System.out.println(semester + " is not a legitimate semester"); //accounts for all other inputs
            }
        }
    }
}