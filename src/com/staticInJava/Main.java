package com.staticInJava;

public class Main {
    public static void main(String[] args) {
        Office e1 = new Office("siva",2000);
        System.out.println(e1.getOffice());
        Office e2 = new Office("sivaaa",2000);
        System.out.println(e1.getOffice());
//        Office.hr = "Sivaaa";
        System.out.println(e1.ceo());

    }
}
