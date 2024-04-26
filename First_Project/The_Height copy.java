public final class
The_Height {



//*/////////////* Camron, Rattigan, 3/26/24
///* Introduction: Writing a program to identify the tallest athlete in basketball,
//whose age is below or comparable to the median of every player.
//is the initial programming assignment. There should be a total of three classes in the program.
///////////*




    private final
    int The_Feet;
    private final
    int The_Inch;
/*/////*///////////////////////////////////////////////////////////
/*/////*///////////////////////////////////////////////////////////
/*/////*///////////////////////////////////////////////////////////

    public The_Height
            (int feet, int inch) {
        The_Feet = feet;
        The_Inch = inch;
    }
/*/////*///////////////////////////////////////////////////////////
/*/////*///////////////////////////////////////////////////////////
/*/////*///////////////////////////////////////////////////////////

    public int toInches()
    {return (The_Feet * 12) + The_Inch;}
/*/////*///////////////////////////////////////////////////////////
/*/////*///////////////////////////////////////////////////////////
/*/////*///////////////////////////////////////////////////////////



    public String toString () {
        if(The_Inch >= 12) {
            int additional_Feet = The_Inch / 12;
            int inchesx = The_Inch % 12;

                     return
                    (The_Feet + additional_Feet) + "'" + inchesx + "\"";
        }
        else
        {return The_Feet + "'" + The_Inch + "\"";}
    }
}