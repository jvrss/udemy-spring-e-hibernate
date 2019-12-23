package com.study.app;

import com.study.model.*;

class MyApp {

    public static void main(String[] args){
    
        // Create the object
        Coach theCoach = new TrackCoach();
    
        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}