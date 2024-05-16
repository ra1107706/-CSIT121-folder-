package com.boostmytool;

import java.util.Scanner;

public class Nesting_Method {
    public static void main(String[] args) {
        //Use two of them thats why its there brooo//
        Scanner Nax = new Scanner(System.in);
        int colums;
        int rows;
        String symbols;
        int numbers;


        System.out.println("How many colums you want?");
        colums = Nax.nextInt();
        System.out.println("How many charc do you want?");
        rows = Nax.nextInt();
        System.out.println("How many symbols you want?");
        symbols = Nax.next();
        System.out.println("How many numbers you want?");
        numbers = Nax.nextInt();


        for (int b = 1; b <= colums; b++) {
            System.out.println();
            for (int d = 1; d <= rows; d++) {
                System.out.print(numbers);

                for (int c = 1; c <= rows; c++) {
                    System.out.print(symbols);
                }
            }


        }
    }
}
