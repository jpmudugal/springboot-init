package com.example.learn2code.common;

import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    public String getDailyWorkout(){
        return "Do 10 laps a day !!!";
    }

}
