package com.example.learn2code.rest;

import com.example.learn2code.common.Coach;
import com.example.learn2code.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportRestController {


    private final Coach myCoach;


    public SportRestController(@Qualifier("cricketCoach") Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/")
    public String getLucky() {
        return "Indeed your first API !! ";
    }

    @GetMapping("/be-active")
    public String playStrong(){
        return "Be More Active !!!! ";
        }

    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}


