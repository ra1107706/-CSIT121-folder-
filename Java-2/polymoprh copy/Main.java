package com.polymoprh;

public class Main { public static void main (String[] args){
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    Vehical[] racers = {car,bicycle,boat};
    for(Vehical x : racers ){
        x.go();

    }

}
}
