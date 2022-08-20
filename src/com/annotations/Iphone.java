package com.annotations;


import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // till what point annotation to work
@interface SmartPhone{
    String os() default "andriod";
    int version() default 1;
}

@SmartPhone(os = "iphone",version = 11)
public class Iphone {
    String model;
    int size;

    public Iphone(String model,int size){
        this.model = model;
        this.size = size;
    }
}
