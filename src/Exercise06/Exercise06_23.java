/*
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
 * As the students enter, the first student, denoted S1, opens every locker. 
 * Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. 
 * Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). 
 * Student S4 begins with locker L4 and changes every fourth locker. 
 * Student S5 starts with L5 and changes every fifth locker, and so on, until student S100 changes L100.
 * After all the students have passed through the building and changed the lockers, which lockers are open? 
 * Write a program to find your answer.
*/
package Exercise06;

/**
 *
 * @author mohit
 * @ID 20CS033
 * @email 20cs033@charusat.edu.in
 * @Chapter 06
 * @Exercise 06.23
 */
public class Exercise06_23 {
    
    // Main class.
    public static void main(String[] args) {
        
        // Declaring 100 locker as boolean
        boolean locker[] = new boolean[100];
        
        // Loop to close all the 100 locker
        for (int i=0; i<locker.length; i++) {
            locker[i] = false;
        }
        
        // Loop to iterate to each locker for each student and check wheather the locker is open or close.
        for (int student = 1; student<= locker.length; student++) {
            
            // check if the locker is open or not and then changing accrodingly.
            for (int lock = 0; lock < locker.length; lock += student) {
                
                if (locker[lock] == true) {
                    locker[lock] = false;
                }
                else {
                    locker[lock] = true;
                }
            }
        }
        
        // Printing the opened locker at the end of 100 students.
        for (int i = 0; i < locker.length;i++) {
            if (locker[i] == true) {
                System.out.println("Lockers open are : " + (i + 1) + " ");
            }
        }
    }
}
