package com.interfaceClass;


public class Main {

    static void doSomething(Writer w){
        w.writes();
    }

    public static void main(String[] args) {
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        doSomething(pencil);

        // lambda in java
        Writer writer = () -> System.out.println("I am the lambda");
        writer.writes();

        Writer w = new Writer() {
            @Override
            public void writes() {
                System.out.println("hi");

            }
        };

        Writer.hello(); // static method from interface
    }

}
