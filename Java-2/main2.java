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
 * @version: 1.0 21.9.2022
 */
import java.text.DecimalFormat;
import java.util.*;
class SpeedyPizza{
    public static void main(String[] args) {
        //to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Casher Name");
        String cashierName = sc.nextLine();
        cashierName = cashierName.toUpperCase();

        System.out.println("Enter Number of Meat Lovers Pizza");
        double meetLover = sc.nextDouble();
        final double meetLoverPrice = 10.99;
        // calculating total price of meetlover pizzza
        double totalMeetLover = meetLover * meetLoverPrice;

        System.out.println("Enter Number of Veggie Lovers Pizza");
        double veggieLover = sc.nextDouble();
        final double veggieLoverPrice = 9.50;
        // calculating total price of veggielover pizza
        double totalVeggieLover = veggieLover * veggieLoverPrice;

        System.out.println("Enter Number of Cheese Lovers Pizza");
        double cheeseLover = sc.nextDouble();
        final double cheeseLoverPrice = 9.99;
        // calculating total price of cheeselover pizza
        double totalCheeseLover = cheeseLover * cheeseLoverPrice;

        //adding overall price
        double totalPrice = totalMeetLover+ totalVeggieLover+ totalCheeseLover;

        //changing the format of digit after decimal
        DecimalFormat df = new DecimalFormat("#.##");
        //Assigning it to the sum variable
        double sum = Double.parseDouble(df.format(totalPrice));

        //Generating random number of 9 digits.
        int random = (int)(Math.random()*(999999999-111111111+1)+111111111);

        //Sample output according to the question.
        System.out.println("                "+"                    "+cashierName);
        System.out.println("                "+"//----------//----------~----------\\\\----------\\\\");
        System.out.println("                        #of Sales       Price       Total");
        System.out.println("Meat Lovers      "+"             "+meetLover+"         $"+meetLoverPrice+"        $"+totalMeetLover);
        System.out.println("Veggie Lovers    "+"             "+veggieLover+"         $"+veggieLoverPrice+"          $"+totalVeggieLover);
        System.out.println("3 Cheese         "+"             "+cheeseLover+"         $"+cheeseLoverPrice+"         $"+totalCheeseLover);

        System.out.println("                "+"              Total"+"                     $"+sum);
        System.out.println("                "+"              Confirmation code:"+random);


        sc.close();
    }
}