package com.encapsulation_And_Copy_Objects;

public class Car {
    private String make;
    private String model;
    private int year;
    Car(String make, String model, int year ){
        this.setModel(model);
        this.setMake(make);
        this.setyear(year);

        //Use "get" method//

    }
    Car(Car x){
        this.copy(x);
    }
    public String getMake(){

        return make;
    }
    public String getModel(){

        return model;
    }
    public int  getyear(){

        return year ;
    }
// use "set" method//
    //loooks like void dosent return anything//
    public void  setMake(String make){
        this.make= make;


    }
    public void  setModel(String model){
        this.model= model;


    }
    public void  setyear(int year){
        this.year= year;


    }
public void copy(Car x){
        this.setMake(x.getMake());
    this.setModel(x.getModel());
    this.setyear(x.getyear());

}

}
