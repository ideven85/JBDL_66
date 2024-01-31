package com.cleo.JBDL.L2.gfg;

public interface IndianGovtNormForCar {

    String getInsurance();

    String getRC();

    default String getLocation(){
        return "NA";
    }
}
