package com.arkia;
// private Engine
// public fly ( double miles ) --> call runEngine

import com.hardware.Engine;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Boeing747 {
//    private Engine engine_of_boeing747;
//    public void fly ( double miles ){
//        engine_of_boeing747.runEngine(miles);
//    }

    private Engine [] arr_engines_of_boeing747;
    public  void  fly2 (double miles){
        for (Engine engine_of_boeing747:
                arr_engines_of_boeing747) {
            engine_of_boeing747.runEngine(miles);
        }
    }


}
