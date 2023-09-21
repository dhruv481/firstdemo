package com.firstdemo;

public class ExceptionHandling {

    public static void main(String[] args){
        //try - catch in exception handling

        int[] marks = {94, 98, 91, 96};
        try {
            System.out.println(marks[6]);
        }catch (Exception exception){
            //sample try - catch
            System.out.println("Exception is being handled...");
        }
        System.out.println("Exception handled Successfully...");
    }
}