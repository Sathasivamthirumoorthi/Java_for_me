package com.inheritence;

public class Main {
    public static void main(String[] args){
        Box box = new Box();
        Box box1 = new Box(4);
        Box box2 = new Box(4,5,6);

//        System.out.println("box " + box.h + " " + box.l + " " + box.w);
//
//        System.out.println("box2 " + box1.h + " " + box1.w + " "+ box1.l);
//
//        System.out.println("box3 " + box2.h + " " + box2.w + " "+ box2.l);

//        box.BoxDisplay();
//        BoxWeight boxWeight = new BoxWeight(1,3,3,1);
//
//        BoxWeight b = new BoxWeight(boxWeight);
//
//        System.out.println(b.weight);
//
//

        BoxPrize boxPrize = new BoxPrize(1,2,3,4,5);
//        System.out.println(boxPrize.l);
//        System.out.println(boxPrize.prize);
//        System.out.println(boxPrize.w);
//        System.out.println(boxPrize.weight);

        BoxPrize boxPrize1 = new BoxPrize(1,2);
        System.out.println(boxPrize1.l);
    }
}
