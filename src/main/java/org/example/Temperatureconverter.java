/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Temperatureconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        double conversion = 0;

        System.out.print("Press C to convert from Fahrenheit to Celsius");
        System.out.print("\nPress F to convert from Fahrenheit to Celsius");
        System.out.print("\nYour Choice: ");
        while (!input.hasNext("C") && !input.hasNext("c") && !input.hasNext("F") && !input.hasNext("f")) {
            input.nextLine();
        }
        String choice = input.nextLine();

        if (choice.equals("C") || choice.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
             temp = input.nextInt();
             conversion = ((temp - 32) * 5)/9;
            System.out.printf("The temperature in Celsius is %.2f", conversion);
        }
        else{
            System.out.print("Please enter the temperature in Celsius: ");
            temp = input.nextInt();
            conversion = ((temp * 9) / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is %.2f", conversion);
        }
    }
}
