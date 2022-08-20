package com.multipleInheritence;

@FunctionalInterface
interface Demo {
    void abc();
    default void show(){
        System.out.println(" in Demo show");

    }
}

