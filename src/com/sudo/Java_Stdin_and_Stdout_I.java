package com.sudo;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        int myInt2 = scanner.nextInt();
        int myInt3 = scanner.nextInt();
        scanner.close();
        System.out.println(myInt);
        System.out.println(myInt2);
        System.out.println(myInt3);
    }
}
