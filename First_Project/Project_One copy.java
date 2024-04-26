import java.util.ArrayList;
import java.util.Scanner;

public class
Project_One {
public static void main(String[] args) {



//*/////////////* Camron, Rattigan, 3/26/24
///* Introduction: Writing a program to identify the tallest athlete in basketball,
//whose age is below or comparable to the median of every player.
//is the initial programming assignment. There should be a total of three classes in the program.
///////////*


            Scanner pro =
        new Scanner(System.in);
        ArrayList
                      <The_First_Player>
                playerList = new ArrayList<>();
/*/////*//////////////*/////*///////////////////////////////////////////////////////////
                double
                age = 0.0;

                 String
                The_Name = "";
/*/////*///////////////////////////////////////////////////////////

        // Looping while the participant's name entry is not 'z'

            while
              (!The_Name.equalsIgnoreCase
                  ("z")) {
            // Asking to provide and read the player's name input
                      System.out.print
                    ("Please enter player's name, and if finished please continue to type z to leave: ");
                       The_Name
                    = pro.nextLine();
/*/////*///////////////////////////////////////////////////////////

              if
            (!The_Name.equalsIgnoreCase
                    ("z")) {
                // Check the height input (in feet and inches).
                System.out.print("Next, please input the following height in feet and inches, separated by a space: ");
                        int
                        The_Height_And_Feet
                                =
                                pro.nextInt();
                        int
                        The_Height_Inch
                                =
                                pro.nextInt();
/*/////*///////////////////////////////////////////////////////////

/*/////*///////////////////////////////////////////////////////////

                         System.out.print
                        ("Lastly please enter the player's age: ");
                      int
                        The_Right_age
                        =
                        pro.nextInt();
/*/////*///////////////////////////////////////////////////////////

                // Create Height object
                The_Height peak
                        =
                        new                    The_Height
                                (The_Height_And_Feet, The_Height_Inch);
                // Create a Player object
                The_First_Player pl
                        =
                        new            The_First_Player
                                (The_Name, peak, The_Right_age);

                age += The_Right_age ;
                playerList.add(pl);
/*/////*///////////////////////////////////////////////////////////

                pro.nextLine();
            }
            System.out.println();
        }


                               double
                The_Average = age / playerList.size();

                      if(playerList.isEmpty()) {
            System.out.println("The average age is zero.");
            System.out.println("There is no tallest player since the list is empty.");
        }

    /*/////*///////////////////////////////////////////////////////////

  /*/////*///////////////////////////////////////////////////////////

        else {
            System.out.println("The average age is " + The_Average);


            The_First_Player
                    The_tallest = playerList.get(0);
  /*/////*///////////////////////////////////////////////////////////

  /*/////*///////////////////////////////////////////////////////////

            for
            (The_First_Player pl: playerList) {
                if(pl.getHeight().toInches() >
                        The_tallest.getHeight().toInches() &&
                        pl.getAge() <= The_Average) {
                    The_tallest = pl;
                }
            }

            System.out.println("The tallest player is: " + The_tallest.toString());
        }
    }
}