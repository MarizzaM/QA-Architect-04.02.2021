package com.company;

import com.arkia.Boeing747;
import com.hardware.Engine;

// main
// create Boing747
// fly
// *Etgar: Boing747 will contains Engine[] with 2 engines
//         fly --> will add miles o both engines
public class Main {

    public static void main(String[] args) {

        Engine[] arr = new Engine[]{
                new Engine("GE CF6", 465, 500, 50, 0),
                new Engine("Rolls-Royce RB211", 4550, 501, -535, 0),
        };

        Boeing747 b747 = new Boeing747(arr);
        b747.fly2(10000);

        System.out.println(b747);
    }
}
