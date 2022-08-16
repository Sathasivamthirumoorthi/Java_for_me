package com.inheritence;

public class BoxPrize extends BoxWeight{
    int prize;

    BoxPrize(){
        this.prize = -1;
    }
    BoxPrize(int prize){
        this.prize = prize;
    }

    BoxPrize(double side , double weight){
        super(side,weight);
    }

    BoxPrize(double l,double h ,double w, double weight,int prize){
        super(l,h,w,weight);
        this.prize = prize;
    }
}
