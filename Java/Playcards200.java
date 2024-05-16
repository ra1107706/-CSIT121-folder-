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
 * @version: 1.0 10.25.2022
 */
package com.boostmytool;
import java.util.Scanner;
public class Playcards200 {
    public static <cards> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What are the amount of cards do you want?");
        int playerOption = sc.nextInt();
        for (int x = 0; x < playerOption; x++) {
            Thecards cards = new Thecards();
            cards.offer();
            System.out.println(cards);
        }
    }
}