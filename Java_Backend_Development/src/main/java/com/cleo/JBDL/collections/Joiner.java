package com.cleo.JBDL.collections;

import java.util.StringJoiner;
import java.util.regex.Pattern;

public class Joiner {

    private static final String TEXT_1 = "Illinois";
    private static final String TEXT_2 = "Mathematics";
    private static final String TEXT_3 = "and";
    private static final String TEXT_4 = "Science";
    private static final String TEXT_5 = "Academy";


    public static String joinByDelimiter(char delimiter,String... args){
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
        for(String arg:args)
            joiner.add(arg);
        String result = String.join(" ","hello","how","are","you");
        System.out.println(result);
        return joiner.toString();

    }
    public static String removeCharacter(String str, char ch) {
        return str.toLowerCase().replaceAll(Pattern.quote(String.valueOf(ch).toLowerCase()),"");
    }

    public static void main(String[] args) {
        System.out.println(joinByDelimiter(' ',TEXT_1,TEXT_2,TEXT_3,TEXT_4,TEXT_5));
        System.out.println(removeCharacter("My Name is Khan",'m'));

    }
}
