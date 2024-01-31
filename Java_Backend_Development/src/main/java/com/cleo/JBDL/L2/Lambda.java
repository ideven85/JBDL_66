package com.cleo.JBDL.L2;

import com.cleo.JBDL.L2.Formula;

import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
        Formula formula = Formula::sqrt;
        System.out.println(formula.calculate(4));
       // System.out.println(formula.calculate(100));
    }
}
