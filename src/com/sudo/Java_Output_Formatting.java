package com.sudo;

import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = in.next();
            int x = in.nextInt();
            System.out.printf("%-15s%03d\n", s, x);
        }
        System.out.println("================================");


        in.close();
    }
}
/*
java 100
cpp 65
python 50


 */