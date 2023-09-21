package com.firstdemo;

import java.util.Scanner;

public class LoopInput {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Enter a number: ");
            num = sc.nextInt();
            System.out.print("Your number is: ");
            System.out.println(num);
        }while(num>=0);

        System.out.println("THE END!!!");
    }
}
