package com.polymorphism;

public class PrintObject {
    int num;

    PrintObject(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return "Object " + num;
    }





    public static void main(String[] args) {
        PrintObject printObject = new PrintObject(3);
        System.out.println(printObject);

    }

}
