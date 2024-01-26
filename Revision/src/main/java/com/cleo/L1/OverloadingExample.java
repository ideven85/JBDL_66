package com.cleo.L1;

public class OverloadingExample {
    public  void m1(){
        System.out.println(" this is zero param agrs. method ");
    }
    public  int m1(int a){
        System.out.println(" this is int  param agrs. method ");
        return  1;

    }
    public  void m1(double d, String s){
        System.out.println(" this is double , string  param agrs. method ");
    }
    public static void main(String[] args) {

        OverloadingExample o = new OverloadingExample();
        o.m1();
        o.m1(2);
        o.m1(22.2,"string value ");
    }
}
