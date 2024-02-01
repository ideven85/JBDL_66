package JBDL.L2;

public class Lambda {
    public static void main(String[] args) {
        Formula formula = Formula::sqrt;
        System.out.println(formula.calculate(4));
       // System.out.println(formula.calculate(100));
    }
}
