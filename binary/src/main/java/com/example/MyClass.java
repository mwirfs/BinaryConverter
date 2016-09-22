package com.example;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        String a = "10101100";
        int decimal = Integer.parseInt(a,2);
        System.out.println(a + " is equal to " + decimal + " in decimal notation");

        String b;
        System.out.println("Enter a binary number");
        Scanner input = new Scanner (System.in);
        b = input.next(); // Get what the user types.

        int c = Integer.parseInt(b,2);
        System.out.println(c);

    }
}
