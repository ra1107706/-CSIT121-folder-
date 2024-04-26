package com.Cassie;

import java.util.Random;
//textually example
//Random random;
//int number;
public class Dice_Roller {
    //random = new random();
   // roll();
    Random random = new Random();
    Dice_Roller(){
        Random random = new Random();
        int number = 0;
        roll(random,number);

    }
    void roll(Random random,int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }

}
