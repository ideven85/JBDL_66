package com.cleo.JBDL.L2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class City {

    private String name;

    @Override
    public String toString () {
        return this.name;
    }

    public static void main (String[] args) {
        List<String> cities = Arrays.asList("Delhi","Mumbai","Kolkata","Chennai");
        String concatenatedCities = String.join("", cities);
        System.out.println(concatenatedCities);
        String citiesWithSpace = String.join(" ",cities);
        System.out.println(citiesWithSpace);
        cities.stream()
                .sorted()
                .forEach(x-> System.out.print(x + " "));
        System.out.println();
        cities.stream()
                .sorted((x,y)->y.length()-x.length())
                .forEach(x-> System.out.print(x+ " "));

    }
}
