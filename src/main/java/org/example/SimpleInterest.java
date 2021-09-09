/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SimpleInterest {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        float principal, rate;
        int years;

        System.out.printf("Enter the principal: ");

        principal = input.nextFloat();

        System.out.printf("Enter the rate of interest: ");

        rate = input.nextFloat();

        System.out.printf("Enter the number of years: ");

        years = input.nextInt();

        float worth = principal * (1 + (rate/100)*years);

        df.setRoundingMode(RoundingMode.UP);

        System.out.printf("After %d years at %.2f%%, the investment will be worth $"+df.format(worth),years, rate);






    }
}
