package com.cleo.L1;
class Parent {

    void m1(){
        System.out.println(" this is parent class m1 method ");
    }
    void m2(){
        System.out.println(" this is n1 parent method ");
    }
}
class  Child extends Parent {

    @Override
    void m1() {
        System.out.println(" this is child class m1");
    }

    void m3(){
        System.out.println(" this child class m2 method ");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {

        Parent p= new Parent();
        p.m1();
        Child c= new Child();
        c.m1();
        c.m2();

    }
}
