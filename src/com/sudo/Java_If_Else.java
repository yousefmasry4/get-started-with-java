package com.sudo;

import java.util.Scanner;

public class Java_If_Else {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if(x % 2 != 0 || x >= 6 && x <= 20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
