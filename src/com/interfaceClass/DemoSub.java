package com.interfaceClass;

import com.accessControl.Demo1;

public class DemoSub extends Demo1 {
    public void show(){
//        a = 1; not a public (default)
        i = 1;  // can you public in a subclass of diff package
//        name = "dsada"; it is private only used inside same class (where it is declared )
        h = "hello"; // can use protector member inside subclass of diff package

    }
}
