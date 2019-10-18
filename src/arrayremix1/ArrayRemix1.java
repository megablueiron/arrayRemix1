/*
 * Michael Botros
 * Oct 18, 2019
 * Prompts the user for twenty inputs and adds them all together
 */

//importing the scanner library
package arrayremix1;
import java.util.Scanner;
/**
 *
 * @author mibot3117
 */
public class ArrayRemix1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a new scanner object
        Scanner keyedInput = new Scanner (System.in);
        
        //creating an array with 20 elements and creatiing a variable for the total
        int [ ] numbers = new int [20];
        int total = 0;
        
        //prompting user for 20 inputs using a for loop
        System.out.println("Enter twenty integers and they will be added together:");
        for (int i = 0; i <= 19; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        
        // adding all the elements of the array
        for (int i = 0; i <= 19; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        //printing out the sum
        System.out.println("The sum of those numbers is:");
        System.out.println(total);
    }
    
}
