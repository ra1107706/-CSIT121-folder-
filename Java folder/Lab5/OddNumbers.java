/** [This section of code should be in every one of your Java submissions]
 * * Camron Rattigan [rattigancam15@icloud.com]
 * Overview: The following program ensures Java is properly installed
 * and Eclipse is working.
 * Input: None
 * Output: Text Display * Variables: None
 * Plan:
 * 1. [Step 1 Ex: User runs the program]
 * 2. [Step 2 Ex: Hello World and the author’s name is displayed]
 *
 * @version: 1.0 8.10.2022
 */
package lab5;
import java.util.Scanner;
public class OddNumbers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int x = 1;
        int num = 0;
        while (x != 0)
         { 
            // Asking user to enter an odd number
            System.out.println("Please enter a odd number?");
             // Sum up the total of odd numbers
            num = scan.nextInt();

            if (num % 2 != 0)
            {total += num;}

            else
            {x = 0;}

        }
        System.out.println("The Total of all of the odd numbers:" + total);
        scan.close();
    }
}

