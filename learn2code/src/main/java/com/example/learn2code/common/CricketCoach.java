package com.example.learn2code.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public String getDailyWorkout(){
        return "Practice 1000 balls a day !!";

    }


}
