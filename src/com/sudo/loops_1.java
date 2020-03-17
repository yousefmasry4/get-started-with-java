package com.sudo;

import java.util.Scanner;

public class loops_1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        int x=scanner.nextInt();

        scanner.close();


        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",x,i,x*i);
        }


    }
}
