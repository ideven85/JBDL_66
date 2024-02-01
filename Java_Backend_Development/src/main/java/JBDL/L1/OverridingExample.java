package JBDL.L1;

class P1{
    P1  action (int a ){
        System.out.println(" parent performed some kind of action ");
        return null;
    }
}
class C1 extends P1{

    @Override
    C1 action(int a ) {
        super.action(a);
        System.out.println(" child performed some action ");
        return null;
    }
}
public class OverridingExample {
    public static void main(String[] args) {

        C1 c1= new C1()
                ;
        c1.action(2);
    }
}
