package com.sudo;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int my_int = scanner.nextInt();
        double my_double=scanner.nextDouble();
        scanner.nextLine();
        String my_str =scanner.nextLine();
        scanner.close();
        System.out.println("String: "+my_str+"\n"+"Double: "+my_double+"\n"+"Int: "+my_int);
    }
}
