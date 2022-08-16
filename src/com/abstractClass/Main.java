package com.abstractClass;

public class Main {
    public static void main(String[] args) {
//        Writer w = new Writer(); we cant create object when a class is abstract
        Pencil pencil = new Pencil();
        pencil.w();
    }
}
