package JBDL.L1;
class Animal{
    int a= 10;

    public  Animal(){
        System.out.println(" this is parent class animal");
    }

    public Animal(int a) {
        System.out.println(" this is parent class int param const. ");
    }
}
class  Dog extends  Animal{
    int w=20;
    public Dog(){
        super(3);
        System.out.println(" this is child class dog ");
    }

    public Dog(int w) {
        this();
        System.out.println(" this is child class int param ");
    }
}

public class superMethod {
    public static void main(String[] args) {

        Dog d= new Dog(7);

    }
}
