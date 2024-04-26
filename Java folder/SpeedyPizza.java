//my package Pizza
package Pizza;

//importing Random
import java.util.Random;

//importing scanner
import java.util.Scanner;

//my SpeedyPizza
public class SpeedyPizza {
    //my main method
    public static void main(String[] args) {
        //declaring Pizza types
        int meat;
        int veggie;
        int three_cheese;

//creating scanner object
        Scanner mine = new Scanner(System.in);

//now asking Meat Cashier name
        System.out.print("Enter Cashier name:");

// input
        String name = mine.nextLine();

//converting to uppercase
        name = name.toUpperCase();

//asking Meat lovers pizza count
        System.out.print("Enter Meat lovers pizza count:");
// input
        meat = mine.nextInt();
        mine.nextLine();

//asking Veggie Lovers pizza count
        System.out.print("Enter Veggie Lovers pizza count:");
// input
        mine.nextInt();
        mine.nextLine();

//asking 3 Cheese pizza count
        System.out.print("Enter 3 Cheese pizza count:");
// input
        mine.nextInt();
        mine.nextLine();

// input
        veggie = mine.nextInt();
        mine.nextLine();

//asking 3 Cheese pizza count
        System.out.print("Enter 3 Cheese pizza count:");
// input
        three_cheese = mine.nextInt();
        mine.nextLine();

//calculating meat_total
        double meat_total = meat * 10.99;

//calculating veggie_total
        double veggie_total = veggie * 9.50;

//calculating three_cheese_total
        double three_cheese_total = three_cheese * 9.99;

//calculating total bill price
        double total = meat_total + veggie_total + three_cheese_total;

//creating random object
        Random r = new Random();

//creating Confirmation code
        int Confirmation_code = 100000000 + r.nextInt(900000000);

//printing new lines
        System.out.println("\n\n\n");

//printing name
        System.out.println("\t\t\t\t " + name);
//printing new lines
        System.out.println("\n");

//printing
        System.out.println("\t // ------------ // -----------n----------- \\\\ ----------- \\\\");
//printing new lines
        System.out.println("\n");

//printing template given
        System.out.println("\t\t\t\t #of Sales\t\t Price\t\tTotal\n");

//printing template given
        System.out.println("\t\t\t\t #of Sales\t\t Price\t\tTotal\n");

//printing Meat lovers values
        System.out.println("Meat lovers\t\t\t\t" + "" + meat + "\t\t   $10.99" + "\t$" + meat_total);
//printing new lines
        System.out.println("\n");

//printing Veggie lovers values
        System.out.println("Veggie lovers\t\t\t\t" + "" + veggie + "\t\t $9.50" + " \t\t$" + veggie_total);
//printing new lines
        System.out.println("\n");

//printing three_cheese values
        System.out.println("3 Cheese\t\t\t\t" + "" + three_cheese + "\t\t $9.99" + "\t\t$" + three_cheese_total);
//printing new lines
        System.out.println("\n");

//printing total
        System.out.println("  \t\t\t\t" + "" + "Total" + "\t\t " + "\t\t$" + total);
//printing new lines
        System.out.println("\n");

//printing conformation code
        System.out.println("      \t\t\t\t" + "" + "Confirmation code: " + Confirmation_code);

// now closing scanner object
        mine.close();
    }
}



















































































































