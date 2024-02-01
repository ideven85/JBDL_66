package JBDL.L1;
class P{
  public  int a= 10;

  void Display(){
      System.out.println(a);
  }

}
class C extends P{
    public  int a=20;
    void show(){
        super.Display();
      //  System.out.println(" parent class a value "+ super.a);//10
        System.out.println(" child  class a value "+ a);//20
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {

        C c= new C();
        c.show();

    }
}
