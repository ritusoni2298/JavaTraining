package com.code.practice;

public class PunchInMachine {
    //instance variables
    private int id;
    private String dt_details;

    public PunchInMachine(int id, String dt_details){ //method parameters //former parameters
        //this is used to distinguish between the instance and method variables.
        this.id = id;
        this.dt_details = dt_details;
    }

    public PunchInMachine(int id){
        this.id =id;
    }
}
