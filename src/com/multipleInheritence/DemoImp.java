package com.multipleInheritence;

// multiple inheritence can achieve by interface
class DemoImp implements Demo,MyDemo {
    @Override
    public void abc() {

    }

    @Override
    public void show() {
        Demo.super.show();
    }
}
