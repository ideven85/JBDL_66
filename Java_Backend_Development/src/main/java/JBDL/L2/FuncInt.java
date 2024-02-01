package JBDL.L2;

public interface FuncInt {

    static int area (int x){
        return x*x;
    }

//    public default int perimeter(int x){
//        return 4*x;
//    }
    int sum_of_area_perimeter(int x);
}
