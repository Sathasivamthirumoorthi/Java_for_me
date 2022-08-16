package com.staticInJava;

import java.util.ArrayList;

public class Office {
    String name;
    int sal;
    static String hr;

    static {
        hr = "Sathasivam";
    }
    static {
        hr = "dhoni";
    }

    public String ceo(){
        return hr;
    }

    public Office(String name,int sal){
        this.name = name;
        this.sal = sal;
    }
    public ArrayList getOffice(){
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(name);
        arr.add(sal);
        return arr;
    }
}
