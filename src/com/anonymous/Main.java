package com.anonymous;

class A{
    public void show(){
        System.out.println(" i am A show");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A(){ // this is an obj of anonymous (scope is only on here)
            public void show(){ // which doesn't have a name
                System.out.println(" i am anonymous"); // cant reuse this
            }
        };
        obj.show();
    }
}
