package com.enumValues;

public class Enum {
    enum Mobile{ // every enum in java extents Enum class , enum cannot inherit, but it can implement the interface
        APPLE(100),HTC(50),IPHONE(1000); // collection - > 0 ,1 ,2
        int price;

        Mobile(){
            System.out.println("Constructor");
            price = 80;
        }

        Mobile(int price){
            this.price = price;
        }

        public int getPrice(){
            return price;
        }
    }

    public static void main(String[] args) {
        Mobile m = Mobile.APPLE;

        System.out.println(m.getPrice());
//        switch (m){
//            case APPLE:
//                System.out.println("Apple");
//                break;
//            case HTC:
//                System.out.println("HTC");
//                break;
//            case IPHONE:
//                System.out.println("IPHONE");
//        }
         Mobile m1[] = Mobile.values(); // values() are given by JVM or compiler

        for(Mobile mobile : m1){
            System.out.println(mobile);
        }

    }
}
