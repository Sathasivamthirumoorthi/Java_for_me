package com.innerClass;

class School{ // outer class
    int rol;
    String name;

    public void show(){
        System.out.println(this.rol + " " + this.name);
    }

    class Inner{
        int mark;
        String sub;
        public void show(){
            System.out.println(mark + "mark is" + sub);
        }
    } // inner class
}

public class Main {
    public static void main(String[] args) {

        School s1 = new School();

        School.Inner s1_mark = s1.new Inner();

        s1_mark.show();
    }


}
