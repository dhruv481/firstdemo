package com.firstdemo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //input in java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();
        Scanner strc = new Scanner(System.in);
        System.out.println("Enter anything about you: ");
        String str = strc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Name is " + name + ". Age is " + age + ". " + str + ".");

        }
    }