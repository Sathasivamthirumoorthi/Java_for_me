package siva;

public class Wrapper {
    public static void main(String[] args) {
        int a = 10; // primitives
        int b = 20;
        Integer num = 10; //wrapper class (it is a class called Integer)

        swap(a,b); // it will not swap , bcz primitives in java is call by value whereas Integer Object in java java is call by reference

        final int v = 2; // cant change

        // the non-primitive is final , you cannot re-assign it
        final A a1 = new A("siva");
//        a1.name="Suhita";
        System.out.println(a1.name);




//        a1 = new  A("sadas") not possible

    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        //Wrapper.sub();
        // we cant use or call the method that is belongs to the instence of the class

        //we can create object in static method and use it
        Wrapper wrapper = new Wrapper();
        wrapper.Hello();

    }

    // the something is which is not static , is belongs to object
    void Hello(){
        // u can use the something that is not belongs to the object swap()
        System.out.println("heloo world");
    }

}

class A {
    final int n = 2; // final should always initialize while declaring
    String name;

    A(String name){
        this.name = name;
    }


}
