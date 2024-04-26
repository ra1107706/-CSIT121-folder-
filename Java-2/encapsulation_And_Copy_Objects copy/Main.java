package com.encapsulation_And_Copy_Objects;

public class Main {
    public static void main(String[]args){
        Car car1 = new Car("Lamb","Camro",2020);
       // Car car2 = new Car("ferri","Caero",2034);

       // car2.copy(car1);


        Car car2 =new Car(car1);

        System.out.println(car1);
        System.out.println(car2);



        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getyear());


        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getyear());

    }
}
