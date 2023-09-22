package com.firstdemo;

import java.util.Scanner;

public class Main {

    public static int printSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void printJava(){
        System.out.println("Hello JAVA.");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int num1 = sc.nextInt();
        System.out.print("Enter b:");
        int num2 = sc.nextInt();
        System.out.println("The Sum of a and b is : " + printSum(num1, num2));

        printJava();
        }
    }