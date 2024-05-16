package com.boostmytool;

import java.lang.Math;
import java.util.Scanner;

public class Math_Class
{
    public static void main (String[] args){

        Scanner Modz = new Scanner(System.in);
        int rec;
        int cir;
        int zet;


        System.out.println("What is the square root of Rectangle?");
        rec = Modz.nextInt();
        Modz.nextLine();


        System.out.println("What is the square root of all of the Circle?");
        cir = Modz.nextInt();
        Modz.nextLine();

        zet = Math.abs(rec+rec+cir+cir);
        System.out.println("The final answer or you may call it the sqaure root is "+zet+ " is your answer");


Modz.close();








    }





}
