package com.boostmytool;

import java.util.Scanner;

public class Laps {
    public static void main(String[] args) {

        Scanner mac = new Scanner(System.in);
String zet = "";


        while (zet.isBlank()){

            System.out.print("Hello user please enter your name?");


           zet = mac.nextLine();


        }

        System.out.println("Finally you've entered your name brooo!!!" +zet);


    }



}
