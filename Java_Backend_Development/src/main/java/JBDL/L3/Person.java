package JBDL.L3;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Person {

    private int id;
    private String name;

    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))
            return false;
        Person p =(Person) obj;
        return this.name== ((Person) obj).name;
    }

    @Override
    public int hashCode() {
        //return new Random(42).ints()*this.age
        return this.name.charAt(0);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        Person p1 = new Person(1,"ABc",10);
        Person p2 = new Person(1,"ABc",10);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        Random r = new Random(42);
        r.setSeed(1);
        System.out.println("Random next: "+r.nextInt());
        System.out.println(r.nextInt());
       // System.out.println(r.toString());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        Map<Person,Boolean> map = new HashMap<>();
//        map.put(p1,true);
//        map.put(p2,true);
        //System.out.println(map.size());
        Person p3 = new Person(2,"ABc",15);
        map.put(p3,true);
        map.put(p2,true);
        map.put(p1,false);
        boolean ans = map.get(p3);
        System.out.println(ans);
        for(var m:map.entrySet())
            System.out.println(m.getKey() + ":" + m.getValue());

        System.out.println(map.size());
    }
}
