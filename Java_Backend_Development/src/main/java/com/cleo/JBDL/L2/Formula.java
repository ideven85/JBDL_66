package com.cleo.JBDL.L2;
@FunctionalInterface
public interface Formula {

    double calculate(int a);

    static double sqrt(int a) {
        return Math.sqrt(a);
    }
}