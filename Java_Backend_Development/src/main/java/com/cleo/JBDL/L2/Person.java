package com.cleo.JBDL.L2;

public interface Person {

    default String getName(String name){
        return name;
    }
}
interface Employee extends Person{

    @Override
    default String getName(String name){
        return "Employee";
    }
}
class Manager{
    private String name;

}

