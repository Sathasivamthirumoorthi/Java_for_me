package com.polymorphism;

public class Circle extends Shape{
    @Override
    void area() {
        System.out.println("this is circle area");
    }

    static void greeting(){
        System.out.println("this is static Circle");
    }
}
