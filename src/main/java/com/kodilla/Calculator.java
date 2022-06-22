package com.kodilla;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = scanner.nextDouble();
        System.out.println("Enter the second number");
        double b = scanner.nextDouble();

        System.out.println("Select operations" + "\n" + "1: sum" + "\n" + "2: difference");
        int x = scanner.nextInt();

        if(x==1) {
            System.out.println("Sum = " + (a+b));
        } else if (x==2) {
            System.out.println("Difference = " + (a-b));
        }

        else {
            System.out.println("Wrong option selected");
        }

    }
}
