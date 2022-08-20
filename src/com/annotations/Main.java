package com.annotations;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Nokia nokia = new Nokia("7",12);
        Iphone iphone = new Iphone("S7",12);
        System.out.println(iphone.model);

        Class obj = iphone.getClass(); // reflection api (used to get value of the object)

        Annotation annotation = obj.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) annotation; // object of annotation
        System.out.println(s.os());

    }
}
