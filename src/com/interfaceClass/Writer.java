package com.interfaceClass;

public interface Writer {
    void writes();
    int a = 1; // every primitive inside interface is final
    default void demo(){
        System.out.println("this is default method");
    }
    static void hello(){
        System.out.println("this is static hello");
    }
}
