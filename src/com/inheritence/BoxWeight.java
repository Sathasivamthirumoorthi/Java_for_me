package com.inheritence;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
        //this.h = 21
    }

    BoxWeight(BoxWeight b){
        super(b);
        this.weight = b.weight;
    }

    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l,double h ,double w, double weight){
        super(l,h,w); // calls the parent class constructor
        System.out.println("this is constructor");
        this.weight = w;
    }
}
