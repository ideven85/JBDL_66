package com.cleo.JBDL.generics;


import java.util.ArrayList;

class Student{
    public void print(){
        System.out.println("Hi I am a student");
    }
}

class EngineeringStudent extends Student{
    @Override
    public void print () {
        System.out.println("Hi I am an Engineering Student");
    }
}

class ManagementStudent extends Student{

    @Override
    public void print () {
        System.out.println("Hi I am a management Student");
    }
}
public class WildCards {

    static void printStudents(ArrayList<? extends Student> students){
        for(Student s: students)
            s.print();
    }

    public static void main (String[] args) {
        /*ArrayList<Student> al1 = new ArrayList<>();
        ArrayList<EngineeringStudent> al2 = new ArrayList<>();

        Student s1 = new Student();
        EngineeringStudent s2 = new EngineeringStudent();
        s1 = s2;
        s1.print();

        //al1=al2; Cannot Do this

        ArrayList<? extends Student> arrayListStudent = new ArrayList<>();
        ArrayList<EngineeringStudent> engineeringStudents = new ArrayList<>();
        arrayListStudent=engineeringStudents;
        */

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Student());
        ArrayList<EngineeringStudent> engineeringStudents = new ArrayList<>();
        engineeringStudents.add(new EngineeringStudent());
        engineeringStudents.add(new EngineeringStudent());
        printStudents(students);
        printStudents(engineeringStudents);
        students.addAll(engineeringStudents);//Possible Because addAll Takes Collection<? extends E> as parameter
        printStudents(students);

        ArrayList<?> al1 = new ArrayList<>();
        ArrayList<EngineeringStudent> engineeringStudents1 = new ArrayList<>();
        al1 = engineeringStudents1;

    }
}
