package com.accessControl;

public class Store {
    String item;
    String color;

    Store(){
        System.out.println("store");
    }
    Store(String item){
        this.item = item;
    }
    Store(String item,String color){
        this.item = item;
        this.color = color;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
