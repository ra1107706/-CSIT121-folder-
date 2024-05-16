package com.boostmytool;



public class TheMainSting { public static void main(String[] args)




    {String tripplexx = "//"; System.out.println("Proceed to enter the string");







        System.out.println("Please press finish to stop");


        java.util.Scanner The = new java.util.Scanner(System.in);


        while


        (true)


        {try {tripplexx = The.next(); if (tripplexx.length() > 20)






                {throw new TheStringDescription("The string has alot of characters!");}






                if (tripplexx.equalsIgnoreCase("Finish"




                )





                )





                {break;}
            } catch (TheStringDescription floor)







            {System.out.println(floor);}
        }
    }



}
