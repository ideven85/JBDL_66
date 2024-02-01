package JBDL.L1;
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        Student s= new Student("ajeet", 19);
        System.out.println(s.getClass());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        s.setName("rohan");
        s.setAge(34);
        System.out.println(" after applying the setter method");
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
