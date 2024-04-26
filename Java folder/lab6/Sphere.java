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
 * @version: 1.0 10.18.2022
 */
import java.util.Scanner;
class Sphere
{ public static void main(String[] args)
{ Scanner ix = new Scanner (System.in);
    SphereDemo Tsp1 = new SphereDemo();
    SphereDemo Tsp2 = new SphereDemo();
    SphereDemo Tsp3 = new SphereDemo();
    System.out.println ("Now please enter the radius of first sphere: ");
    Tsp1.placeRadius(ix.nextDouble());
    Tsp1.placeID("Tsp1");
    System.out.println ("Next please enter the radius for the second sphere: ");
    Tsp2.placeRadius(ix.nextDouble());
    Tsp2.placeID("Tsp2");
    System.out.println ("Finally please enter the radius for the last sphere: ");
    Tsp3.placeRadius(ix.nextDouble());
    Tsp3.placeID("Tsp3");
    System.out.println (Tsp1);
    System.out.println (Tsp2);
    System.out.println (Tsp3);


}
}

class SphereDemo

{    private double radius;
    private String ID;
    public double getRadius() {return radius;}
    public void placeRadius(double radius) {this.radius = radius;}
    public String placeID() {return ID;}
    public void placeID(String ID ) {this.ID = ID;}
    public double vol() {return (4.0 / 3) * Math.PI * radius * radius * radius;}
    public double zone() {return 4 * Math.PI * radius * radius;}
    @Override
    public String toString()
    {return "Id: " + ID + ", Rad: " + radius + ", Zone: " + zone() + ", Vol: " + vol();}
}


