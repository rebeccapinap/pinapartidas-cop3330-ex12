package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Calculates simple interest with user input
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interest = input.nextDouble();

        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        double total = principal * (1 + ( years * (interest / 100)));

        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.2f.", years, interest, total);
    }
}
