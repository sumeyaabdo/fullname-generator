package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Asking for name
        System.out.println("""
                Please enter your name
                First name:""");
        String first = scanner.nextLine();
        String firstName = first.trim();

        System.out.println("Middle name: ");
        String midd = scanner.nextLine();
        String middleName = midd.trim();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();


        System.out.println("Full name: " + firstName + " " + midd + " " + lastName + " " + suffix);


    }

}
