package com.firstdemo;

import java.util.Scanner;

public class Input {

    public static void main(String[] args){
        //input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        Scanner strc = new Scanner(System.in);
        System.out.println("Enter anything about you: ");
        String str = strc.nextLine();
        System.out.println("Name is " + name + ". Age is " + age + ". " + str + ".");

    }
}
