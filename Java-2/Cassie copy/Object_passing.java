package com.Cassie;

public class Object_passing { public static void main (String[] args){
    Garage garage = new Garage();
    Car car1 = new Car("BMW");
    Car car2 = new Car("lambo");
    garage.parking(car1);
    garage.parking(car2);

}
}
