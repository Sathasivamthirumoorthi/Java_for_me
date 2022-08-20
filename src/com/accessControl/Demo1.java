package com.accessControl;

public class Demo1 {
    int a; // it is used within a package (package private)
    public int i; // use everywhere in every package
    private String name; // it is used only in same class (final or const)
    protected String h; // it can be used in same package and also used inside the subclass of different package
}
