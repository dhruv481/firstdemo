package com.firstdemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //try - catch in exception handling

        int[] marks = {94, 98, 91, 96};
        try {
            System.out.println(marks[6]);
        }catch (Exception exception){
            //sample try - catch
            System.out.println("Exception is being handled...");
        }
        System.out.println("Exception handled Successfully...");

//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        do {
//            System.out.println("Enter a number: ");
//            num = sc.nextInt();
//            System.out.print("Your number is: ");
//            System.out.println(num);
//        }while(num>=0);
//
//        System.out.println("THE END!!!");

        //For Loop
        //print 1-100
//        for (int i = 1;i<=100; i++){
//            System.out.println(i);
//        }

        //print 100-1
//        for (int j = 100; j>=1; j--){
//            System.out.println(j);
//        }

        //While Loop
        //final int k = 100;    with final keyword value becomes constant and cannot be changed further.
//        int k = 100;
//        while (k>=1){
//            System.out.println(k);
//            k=k-1;
//        }

        //Do While
//        int l = 100;
//        do {
//            System.out.println(l);
//            l = l - 1;
//        }while (l>=1);

        //input in java
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name:");
        //String name = sc.next();
        //Scanner strc = new Scanner(System.in);
        //System.out.println("Enter anything about you: ");
        //String str = strc.nextLine();
        //System.out.println("Enter your age:");
        //int age = sc.nextInt();
        //System.out.println("Name is " + name + ". Age is " + age + ". " + str + ".");

        }
    }