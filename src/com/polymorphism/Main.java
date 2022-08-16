package com.polymorphism;

public class Main {

    public static void main(String[] args) {



        Shape shape = new Shape();
        Shape circle = new Circle(); // which will run is determine by using dynamic method dispatch(dependent on type of object)
        //Shape circle = new Circle(); it depends on type of object (it will run Circle)
        Triangle triangle = new Triangle();

//        shape.area();

//        circle.greeting(); //Circle it does not depends on object1
        
    }
}
