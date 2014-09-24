//

import java.util.Scanner;

public class CourseNumber {
    
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a six digit number giving the course semester- ");
        int courseNumber = myScanner.nextInt();
        
        if (courseNumber<186510 || courseNumber>201440) {
            System.out.println("The number was outside the range [186510,201440]");
        } else {
            int year = courseNumber / 100;
            int semester = courseNumber % 100;
            if (semester == 40) {
                System.out.println("The course was offered in the Fall Semester of " + year);
            } else if (semester == 30) {
                System.out.println("The course was offered in the Summer 2 semester of " + year);
            } else if (semester == 20) {
                System.out.println("The course was offered in the Summer 1 semester of " + year);
            } else if (semester == 10) {
                System.out.println("The course was offered in the Spring semester of " + year);
            } else {
                System.out.println(semester + " is not a legitimate semester");
            }
        }
    }
}