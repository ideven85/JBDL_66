package JBDL.L1;
class Person1{
    private String name;
    private  int age;

    public Person1(){

    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display(){

        System.out.println("name : "+ name+ " age : "+ age );
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        Person1 p= new Person1();
        Person1 p1= new Person1("rama ", 4);

        p.display();
        p1.display();

    }
}
