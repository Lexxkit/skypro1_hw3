package com.lexxkit;

public class Main {

    public static void main(String[] args) {
	    // Task 1
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Install iOS application from the link.");
        } else {
            System.out.println("Install Android application from the link.");
        }

        // Task 2
        int clientDeviceYear = 2013;
        boolean isPhoneNew = clientDeviceYear >= 2015;

        if (clientOS == 0 && isPhoneNew) {
            System.out.println("Install iOS application from the link.");
        } else if (clientOS == 0 && !isPhoneNew) {
            System.out.println("Install the light version of iOS application from the link.");
        }

        if (clientOS == 1 && isPhoneNew) {
            System.out.println("Install Android application from the link.");
        } else if (clientOS == 1 && !isPhoneNew) {
            System.out.println("Install the light version of Android application from the link.");
        }

    }
}
