package com.hardware;
import lombok.AllArgsConstructor;
import lombok.ToString;
// package 1 -- Hardware
// class Engine
// public String name
// public int size
// private double miles
// private int model_number
// [default] int number_of_cyl
// public runEngine( double more_miles )
// [default] bool doesEngineneedsRestart
//          miles > miles_per_restart
// private static final double miles_per_restart =....


@AllArgsConstructor
@ToString
public class Engine {
    private static  final double miles_per_restart = 100000;
    public String name;
    public int size;
    private double miles;
    private int model_number;
    int number_of_cyl;

    public void runEngine( double more_milers){
        miles += more_milers;
    }
    boolean doesEngineNeedsRestart(){
        if (miles > miles_per_restart)
            return true;
        else
            return false;
    }




}
