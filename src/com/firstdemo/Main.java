package com.firstdemo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello Dhruv!");  first program

        int age = 22;       //initialization
        System.out.println("age = " + age);     //Output in Java

        //Strings
        //initialization
        String fname = "Dhruv";
        String lname = "Gupta";

        //Concatenation
        String name = fname + " " + lname;
        System.out.println(name);

        //charAt (starts from index 0)
        System.out.println(name.charAt(3));

        //Length
        System.out.println(name.length());

        //replace (works separately for lowercase and uppercase)
        String demo =  "Aman";
        String demonew = demo.replace('a','b');
        System.out.println("old = " + demo + "     and new = " + demonew);

        //Sub-string (first index is taken into substring and last index is not taken)
        System.out.println(name.substring(6,11));

        }
    }