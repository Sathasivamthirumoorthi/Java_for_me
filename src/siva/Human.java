package siva;

import java.util.ArrayList;

public class Human{
    int no;
    String name;

    static String dep = "";

    Human(){
        // calling constructor from another constructor
        this (21, "human");
    }

    public Human(int no,String name){
        System.out.println("constructor");
        this.no = no;
        this.name = name;
    }
    public ArrayList getHuman(){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(no);
        arrayList.add(name);
        arrayList.add(dep);
        return arrayList;
    }


}

