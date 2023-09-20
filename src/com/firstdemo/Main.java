package com.firstdemo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello Dhruv!");  first program

        int age = 22;       //initialization
        System.out.println("age = " + age);     //Output in Java

        //Aray
        int[] marks = new int[4];
        marks[0] = 94;
        marks[1] = 95;
        marks[2] = 97;
        marks[3] = 92;

        System.out.println(marks[1]);

        //length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //2-D array
        int[][] finalMarks = {{91,93,96,94}, {98,94,92,97}};
        System.out.println(finalMarks[1][0]);


        }
    }