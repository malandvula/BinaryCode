package com.company;

public class Decimal {
    // Return the decimal value of a character

    // Instance variable
    int decimal, size;
    String userInput;

    // Default constructor
    public Decimal(){}

    // Constructor overload
    public Decimal(String userInput){
        this.userInput = userInput;
        this.size = userInput.length();
        stringToDec();
    }

    private void stringToDec(){
            char a = this.userInput.charAt(0);
            this.decimal = a;
    }


    public int size(){
        return size;
    }

    public int dec(){
        return decimal;
    }
}
