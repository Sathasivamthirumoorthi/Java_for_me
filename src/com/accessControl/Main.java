package com.accessControl;

public class Main {
    public static void main(String[] args) {
        Store s = new Store("bags");
//        SubClass sub = new SubClass(1,2);
//        System.out.println(sub);
//        System.out.println(s.getItem());
//        s.setItem("bats");
//        System.out.println(s.getItem());
//        SubClass2 sub2= new SubClass2();
//        System.out.println(sub2);
        SubClass subClass = new SubClass();
        System.out.println(subClass.store());
    }
}
