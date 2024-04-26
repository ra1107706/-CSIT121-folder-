package com.dynamic_polymoprh;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){


    Scanner scanner = new Scanner (System.in);
    //has to extend to one class such as "Animal"//
    Animal animal = new Animal();
    System.out.println("What do you want");
    System.out.println("1=dog or 2=cat or 3=shark ");
    int vince = scanner.nextInt();


    if(vince==1){
        animal = new Dog();
        animal.truth();
    }

    else if (vince==2) {
        animal = new Cat();
        animal.truth();


    }

     else if ( vince==3){

              animal = new Shark();

        animal.truth();
        }

    else{
        animal = new Animal();
        System.out.println("Something diffrent");

        animal.truth();
    }


}
}
