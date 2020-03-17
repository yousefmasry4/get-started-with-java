package com.sudo;



class Animal{
    void walk(){
        System.out.println("I am walking");
    }

    void  sound(){
        System.out.print("I am ");
    }
}



class Bird extends Animal {
    public  int x;
    void fly() {
        System.out.println("I am flying");
    }
    void  sound(){
        super.sound();
        System.out.println("singing");

    }
}



public class Inh_1 {
    public static void main(String[] args){


        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sound();
    }
}

