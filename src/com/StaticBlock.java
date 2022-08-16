package com;

public class StaticBlock {
    static int a = 5;
    static int b = 3;

    static {
        System.out.println("this is static");
        b = b * 2;
    }

    public static void main(String[] args) {
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(staticBlock.a + " "  + staticBlock.b);
    }
}
