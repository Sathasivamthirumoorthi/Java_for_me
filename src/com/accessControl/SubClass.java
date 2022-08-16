package com.accessControl;

public class SubClass extends Store{
    int d;

    Store s = new Store();

    public SubClass(){

        System.out.println("subclass");
    }
    public SubClass(int item1,int item2){
        super("s","c");
        System.out.println(item1 + " " + item2);
    }

    public String store(){

        s.setItem("shirt");
        s.setColor("white");
        String shirt = s.getItem();
        String color = s.getColor();
        return shirt + color;
    }

}
