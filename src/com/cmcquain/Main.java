package com.cmcquain;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5;
	    float myFloatValue = 5f /2f;
	    double myDoubleValue = 5d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237;
        System.out.println("Kilograms = " + convertedKilograms);
    }
}
