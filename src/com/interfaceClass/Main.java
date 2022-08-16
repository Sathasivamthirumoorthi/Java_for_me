package com.interfaceClass;


public class Main {

    static void doSomething(Writer w){
        w.writes();
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        doSomething(pencil);
    }

}
