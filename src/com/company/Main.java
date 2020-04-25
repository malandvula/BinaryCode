package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// collection information from the user

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input here: ");
        String input = scan.next();

        Decimal binaryCode = new Decimal(input);

        System.out.println(binaryCode);
    }
}
