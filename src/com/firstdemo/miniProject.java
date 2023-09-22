package com.firstdemo;

import java.util.Scanner;

public class miniProject {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int rnum = (int)(Math.random()*10);
        int gnum;

        System.out.println(rnum);
        do {
            System.out.print("Guess the number: ");
            gnum = sc.nextInt();

            if(gnum == rnum){
                System.out.println("You guessed it right!!!");
                break;
            } else if (gnum > rnum) {
                System.out.println("Number is large. Try again...");

            }else {
                System.out.println("Number is small. Try again...");
            }

        }while (gnum >=0);

        System.out.println(" the correct number was: " + rnum);
    }
}
