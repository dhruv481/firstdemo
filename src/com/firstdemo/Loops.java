package com.firstdemo;

public class Loops {

    public static void main (String[] args){
        //For Loop
        //print 1-100
        for (int i = 1;i<=100; i++){
            System.out.println(i);
        }

        //print 100-1
        for (int j = 100; j>=1; j--){
            System.out.println(j);
        }

        //While Loop
        //final int k = 100;    with final keyword value becomes constant and cannot be changed further.
        int k = 100;
        while (k>=1){
            System.out.println(k);
            k=k-1;
        }

        //Do While
        int l = 100;
        do {
            System.out.println(l);
            l = l - 1;
        }while (l>=1);

    }
}
