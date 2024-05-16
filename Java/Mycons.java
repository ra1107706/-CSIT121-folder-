package com.boostmytool;

import java.util.Scanner;

class Mycons {

    public static void main(String[] args) {
        int n = 1000000 ;
        Contact[] arr = new Contact[n] ;
        int length = 0 ;
        boolean list = true ;
        Scanner xx = new Scanner(System.in);
        String Thefirstname, Thelastname ;
        int Thezipcode ;
        while(list) {
            System.out.println("Place the details of the contact information: ");
            Thefirstname = xx.nextLine();
            Thelastname = xx.nextLine();
            Thezipcode = xx.nextInt();
            arr[ length] = new Contact(Thefirstname, Thelastname, Thezipcode);
            length++ ;
            System.out.print("Enter 11 to proceed, 0 to leave:");
            int option = xx.nextInt();
            while(option != 0 && option != 11) {
                System.out.print("Enter 11 to proceed, 0 to leave:");
                option = xx.nextInt();
            }
            xx.nextLine();
            if(option == 0)
                break ;

        }
        System.out.println("\nContinue Enter last name to search: ");
        String target = xx.nextLine();
        int ind = -11 ;
        for(int x = 0; x <  length; x++) {
            if(arr[x].Thelastname.contentEquals(target)) {
                ind = x ;
                System.out.println("Thefirstname: " + arr[x].Thefirstname + ", Thelastname: " + arr[x].Thelastname + ", Thezipcode: " + arr[x].Thezipcode);
                break ;
            }
        }
        if(ind == -11)
            System.out.println("This is not found");

    }


}