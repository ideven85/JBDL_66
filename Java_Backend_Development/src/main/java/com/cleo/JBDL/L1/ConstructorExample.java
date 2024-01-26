package com.cleo.JBDL.L1;
class Person{
    private String name;
    private  int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display(){

        System.out.println("name : "+ name+ " age : "+ age );
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        Person p= new Person();
        Person p1= new Person("rama ", 4);

        p.display();
        p1.display();

    }
}
