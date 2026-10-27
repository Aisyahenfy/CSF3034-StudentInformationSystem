package studentinformationsystem;
/************************************************************************
 * Author: NURAISYAH HAMIRAH BINTI ZUKEPLI
 * Program Name: StudentProfile.java
 * Description: Displays student profile information
 * Date: 22 October 2026
 * Version: 1.0
 ************************************************************************/
public class StudentInformationSystem { // main class
    public static void main(String[] args) { //main method
        // i. Display student name and student ID
        String name = "NURAISYAH HAMIRAH BINTI ZUKEPLI";
        String studentID = "S84796";
        
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        
        // ii. Store two marks in variables
        double mark1 = 50.0;
        double mark2 = 42.0;
        
        // iii. Calculate total mark
        double total = mark1 + mark2;
        
        // iv. Display total mark
        System.out.println("Total Mark: " + total);
        
        // v. Display result message
        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 60) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
// Activity 8 Final Submission