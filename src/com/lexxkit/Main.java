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

        // Task 3
        int year = 2021;

        boolean isLeapYear = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is an ordinary year.");
        }

        // Task 4
        int deliveryDays = 1;
        int deliveryDistance = 95;

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
        }

        System.out.println("Your delivery will take: " + deliveryDays + " days.");

        // Task 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring is here.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer time!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall. Winter is coming!!!");
                break;
            default:
                break;
        }

        // Task 6
        System.out.println("\nTask 6\n");

        int age = 25;
        int salary = 60_000;

        int creditLimit = 0;

        if (age < 23) {
            creditLimit = salary * 2;
        } else {
            creditLimit = salary * 3;
        }

        if (salary >= 50_000 && salary < 80_000) {
            creditLimit *= 1.2;
        } else if (salary >= 80_000) {
            creditLimit *= 1.5;
        }

        System.out.printf("We can offer you a credit card with a limit of %d rubles.", creditLimit);

        // Task 7
        System.out.println("\nTask 7\n");

        double YEARLY_BASE_RATE = 0.1;
        int LOAN_TERMS_MONTHS = 12;
        double MAX_MONTHLY_PAYMENT = 0.5;

        int wantedSum = 330_000;

        if (age < 23) {
            YEARLY_BASE_RATE += 0.01;
        } else if (age >= 23 && age < 30) {
            YEARLY_BASE_RATE += 0.005;
        }

        if (salary > 80_000) {
            YEARLY_BASE_RATE -= 0.007;
        }

        double maxAllowedPayment = salary * MAX_MONTHLY_PAYMENT;
        double totalCreditWithInterest = wantedSum + wantedSum * YEARLY_BASE_RATE * (LOAN_TERMS_MONTHS / 12);
        double monthlyCreditPayment = totalCreditWithInterest / LOAN_TERMS_MONTHS;

        String creditDecision = monthlyCreditPayment <= maxAllowedPayment ? "Approved" : "Denied";

        System.out.printf("Max payment based on salary of %d is %.2f rubles.\nMonthly payment is %.2f rubles. %s.",
                salary, maxAllowedPayment, monthlyCreditPayment, creditDecision);
    }
}
