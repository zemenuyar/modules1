package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner Keyboard = new Scanner(System.in);
        String response = "";

        do {
            System.out.println("Enter a number; ");
            int input = Keyboard.nextInt();


            for (int index = input; index >= 1; index--) {
                if (index % 7 == 0 || index % 5 == 0) {
                    System.out.println(index);
                }
            }
            System.out.println("would you like to enter another number (y/n");
            response = Keyboard.next();

        }
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes"));
        System.out.println("thank you for playing!");

    }
}