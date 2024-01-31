package com.cleo.JBDL.collections;

import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Util {

    private static final String s= "[jttwt jttwu jttwv jttxt jttxu jttxv jttyt jttyu jttyv jttzt jttzu jttzv jtuwt jtuwu jtuwv jtuxt jtuxu jtuxv jtuyt jtuyu jtuyv jtuzt jtuzu jtuzv jtvwt jtvwu jtvwv jtvxt jtvxu jtvxv jtvyt jtvyu jtvyv jtvzt jtvzu jtvzv jutwt jutwu jutwv jutxt jutxu jutxv jutyt jutyu jutyv jutzt jutzu jutzv juuwt juuwu juuwv juuxt juuxu juuxv juuyt juuyu juuyv juuzt juuzu juuzv juvwt juvwu juvwv juvxt juvxu juvxv juvyt juvyu juvyv juvzt juvzu juvzv jvtwt jvtwu jvtwv jvtxt jvtxu jvtxv jvtyt jvtyu jvtyv jvtzt jvtzu jvtzv jvuwt jvuwu jvuwv jvuxt jvuxu jvuxv jvuyt jvuyu jvuyv jvuzt jvuzu jvuzv jvvwt jvvwu jvvwv jvvxt jvvxu jvvxv jvvyt jvvyu jvvyv jvvzt jvvzu jvvzv kttwt kttwu kttwv kttxt kttxu kttxv kttyt kttyu kttyv kttzt kttzu kttzv ktuwt ktuwu ktuwv ktuxt ktuxu ktuxv ktuyt ktuyu ktuyv ktuzt ktuzu ktuzv ktvwt ktvwu ktvwv ktvxt ktvxu ktvxv ktvyt ktvyu ktvyv ktvzt ktvzu ktvzv kutwt kutwu kutwv kutxt kutxu kutxv kutyt kutyu kutyv kutzt kutzu kutzv kuuwt kuuwu kuuwv kuuxt kuuxu kuuxv kuuyt kuuyu kuuyv kuuzt kuuzu kuuzv kuvwt kuvwu kuvwv kuvxt kuvxu kuvxv kuvyt kuvyu kuvyv kuvzt kuvzu kuvzv kvtwt kvtwu kvtwv kvtxt kvtxu kvtxv kvtyt kvtyu kvtyv kvtzt kvtzu kvtzv kvuwt kvuwu kvuwv kvuxt kvuxu kvuxv kvuyt kvuyu kvuyv kvuzt kvuzu kvuzv kvvwt kvvwu kvvwv kvvxt kvvxu kvvxv kvvyt kvvyu kvvyv kvvzt kvvzu kvvzv lttwt lttwu lttwv lttxt lttxu lttxv lttyt lttyu lttyv lttzt lttzu lttzv ltuwt ltuwu ltuwv ltuxt ltuxu ltuxv ltuyt ltuyu ltuyv ltuzt ltuzu ltuzv ltvwt ltvwu ltvwv ltvxt ltvxu ltvxv ltvyt ltvyu ltvyv ltvzt ltvzu ltvzv lutwt lutwu lutwv lutxt lutxu lutxv lutyt lutyu lutyv lutzt lutzu lutzv luuwt luuwu luuwv luuxt luuxu luuxv luuyt luuyu luuyv luuzt luuzu luuzv luvwt luvwu luvwv luvxt luvxu luvxv luvyt luvyu luvyv luvzt luvzu luvzv lvtwt lvtwu lvtwv lvtxt lvtxu lvtxv lvtyt lvtyu lvtyv lvtzt lvtzu lvtzv lvuwt lvuwu lvuwv lvuxt lvuxu lvuxv lvuyt lvuyu lvuyv lvuzt lvuzu lvuzv lvvwt lvvwu lvvwv lvvxt lvvxu lvvxv lvvyt lvvyu lvvyv lvvzt lvvzu lvvzv]";

    public static String joinByDelimeter(){
        String[] next = s.split(" ");
        StringJoiner tokens = new StringJoiner(" ");
        StringBuilder finalString = new StringBuilder();
        for(var n:next){
            finalString.append(n).append(", ");
        }
        return finalString.toString();
    }

    public static int diff(String other){
        joinByDelimeter();
        return -1;

    }
    private static long sum(long s){

        return s==0?0: s%10+sum(s/10);
    }
    public static void sum7(){
        var stream =  (IntStream.rangeClosed(10000,99999).map(c->(char)c).mapToLong(x->(long) x).toArray());
        int count=0;
        for (int i = 0; i < stream.length; i++) {
            if(sum(stream[i])==7)
                count++;
        }
        System.out.println(count);
    }

    public static void main (String[] args) {
        //System.out.println(joinByDelimeter());
        String original = "jttwt jttwu jttwv jttxt jttxu jttxv jttyt jttyu jttyv jttzt jttzu jttzv jtuwt jtuwu jtuwv jtuxt jtuxu jtuxv jtuyt jtuyu jtuyv jtuzt jtuzu jtuzv jtvwt jtvwu jtvwv jtvxt jtvxu jtvxv jtvyt jtvyu jtvyv jtvzt jtvzu jtvzv jutwt jutwu jutwv jutxt jutxu jutxv jutyt jutyu jutyv jutzt jutzu jutzv juuwt juuwu juuwv juuxt juuxu juuxv juuyt juuyu juuyv juuzt juuzu juuzv juvwt juvwu juvwv juvxt juvxu juvxv juvyt juvyu juvyv juvzt juvzu juvzv jvtwt jvtwu jvtwv jvtxt jvtxu jvtxv jvtyt jvtyu jvtyv jvtzt jvtzu jvtzv jvuwt jvuwu jvuwv jvuxt jvuxu jvuxv jvuyt jvuyu jvuyv jvuzt jvuzu jvuzv jvvwt jvvwu jvvwv jvvxt jvvxu jvvxv jvvyt jvvyu jvvyv jvvzt jvvzu jvvzv kttwt kttwu kttwv kttxt kttxu kttxv kttyt kttyu kttyv kttzt kttzu kttzv ktuwt ktuwu ktuwv ktuxt ktuxu ktuxv ktuyt ktuyu ktuyv ktuzt ktuzu ktuzv ktvwt ktvwu ktvwv ktvxt ktvxu ktvxv ktvyt ktvyu ktvyv ktvzt ktvzu ktvzv kutwt kutwu kutwv kutxt kutxu kutxv kutyt kutyu kutyv kutzt kutzu kutzv kuuwt kuuwu kuuwv kuuxt kuuxu kuuxv kuuyt kuuyu kuuyv kuuzt kuuzu kuuzv kuvwt kuvwu kuvwv kuvxt kuvxu kuvxv kuvyt kuvyu kuvyv kuvzt kuvzu kuvzv kvtwt kvtwu kvtwv kvtxt kvtxu kvtxv kvtyt kvtyu kvtyv kvtzt kvtzu kvtzv kvuwt kvuwu kvuwv kvuxt kvuxu kvuxv kvuyt kvuyu kvuyv kvuzt kvuzu kvuzv kvvwt kvvwu kvvwv kvvxt kvvxu kvvxv kvvyt kvvyu kvvyv kvvzt kvvzu kvvzv lttwt lttwu lttwv lttxt lttxu lttxv lttyt lttyu lttyv lttzt lttzu lttzv ltuwt ltuwu ltuwv ltuxt ltuxu ltuxv ltuyt ltuyu ltuyv ltuzt ltuzu ltuzv ltvwt ltvwu ltvwv ltvxt ltvxu ltvxv ltvyt ltvyu ltvyv ltvzt ltvzu ltvzv lutwt lutwu lutwv lutxt lutxu lutxv lutyt lutyu lutyv lutzt lutzu lutzv luuwt luuwu luuwv luuxt luuxu luuxv luuyt luuyu luuyv luuzt luuzu luuzv luvwt luvwu luvwv luvxt luvxu luvxv luvyt luvyu luvyv luvzt luvzu luvzv lvtwt lvtwu lvtwv lvtxt lvtxu lvtxv lvtyt lvtyu lvtyv lvtzt lvtzu lvtzv lvuwt lvuwu lvuwv lvuxt lvuxu lvuxv lvuyt lvuyu lvuyv lvuzt lvuzu lvuzv lvvwt lvvwu lvvwv lvvxt lvvxu lvvxv lvvyt lvvyu lvvyv lvvzt lvvzu lvvzv";
        String result = "";
        System.out.println(diff("[jttwt, jttwu, jttwv, jttxt, jttxu, jttxv, jttyt, jttyu, jttyv, jttzt, jttzu, jttzv, jtuwt, jtuwu, jtuwv, jtuxt, jtuxu, jtuxv, jtuyt, jtuyu, jtuyv, jtuzt, jtuzu, jtuzv, jtvwt, jtvwu, jtvwv, jtvxt, jtvxu, jtvxv, jtvyt, jtvyu, jtvyv, jtvzt, jtvzu, jtvzv, jutwt, jutwu, jutwv, jutxt, jutxu, jutxv, jutyt, jutyu, jutyv, jutzt, jutzu, jutzv, juuwt, juuwu, juuwv, juuxt, juuxu, juuxv, juuyt, juuyu, juuyv, juuzt, juuzu, juuzv, juvwt, juvwu, juvwv, juvxt, juvxu, juvxv, juvyt, juvyu, juvyv, juvzt, juvzu, juvzv, jvtwt, jvtwu, jvtwv, jvtxt, jvtxu, jvtxv, jvtyt, jvtyu, jvtyv, jvtzt, jvtzu, jvtzv, jvuwt, jvuwu, jvuwv, jvuxt, jvuxu, jvuxv, jvuyt, jvuyu, jvuyv, jvuzt, jvuzu, jvuzv, jvvwt, jvvwu, jvvwv, jvvxt, jvvxu, jvvxv, jvvyt, jvvyu, jvvyv, jvvzt, jvvzu, jvvzv, kttwt, kttwu, kttwv, kttxt, kttxu, kttxv, kttyt, kttyu, kttyv, kttzt, kttzu, kttzv, ktuwt, ktuwu, ktuwv, ktuxt, ktuxu, ktuxv, ktuyt, ktuyu, ktuyv, ktuzt, ktuzu, ktuzv, ktvwt, ktvwu, ktvwv, ktvxt, ktvxu, ktvxv, ktvyt, ktvyu, ktvyv, ktvzt, ktvzu, ktvzv, kutwt, kutwu, kutwv, kutxt, kutxu, kutxv, kutyt, kutyu, kutyv, kutzt, kutzu, kutzv, kuuwt, kuuwu, kuuwv, kuuxt, kuuxu, kuuxv, kuuyt, kuuyu, kuuyv, kuuzt, kuuzu, kuuzv, kuvwt, kuvwu, kuvwv, kuvxt, kuvxu, kuvxv, kuvyt, kuvyu, kuvyv, kuvzt, kuvzu, kuvzv, kvtwt, kvtwu, kvtwv, kvtxt, kvtxu, kvtxv, kvtyt, kvtyu, kvtyv, kvtzt, kvtzu, kvtzv, kvuwt, kvuwu, kvuwv, kvuxt, kvuxu, kvuxv, kvuyt, kvuyu, kvuyv, kvuzt, kvuzu, kvuzv, kvvwt, kvvwu, kvvwv, kvvxt, kvvxu, kvvxv, kvvyt, kvvyu, kvvyv, kvvzt, kvvzu, kvvzv, lttwt, lttwu, lttwv, lttxt, lttxu, lttxv, lttyt, lttyu, lttyv, lttzt, lttzu, lttzv, ltuwt, ltuwu, ltuwv, ltuxt, ltuxu, ltuxv, ltuyt, ltuyu, ltuyv, ltuzt, ltuzu, ltuzv, ltvwt, ltvwu, ltvwv, ltvxt, ltvxu, ltvxv, ltvyt, ltvyu, ltvyv, ltvzt, ltvzu, ltvzv, lutwt, lutwu, lutwv, lutxt, lutxu, lutxv, lutyt, lutyu, lutyv, lutzt, lutzu, lutzv, luuwt, luuwu, luuwv, luuxt, luuxu, luuxv, luuyt, luuyu, luuyv, luuzt, luuzu, luuzv, luvwt, luvwu, luvwv, luvxt, luvxu, luvxv, luvyt, luvyu, luvyv, luvzt, luvzu, luvzv, lvtwt, lvtwu, lvtwv, lvtxt, lvtxu, lvtxv, lvtyt, lvtyu, lvtyv, lvtzt, lvtzu, lvtzv, lvuwt, lvuwu, lvuwv, lvuxt, lvuxu, lvuxv, lvuyt, lvuyu, lvuyv, lvuzt, lvuzu, lvuzv, lvvwt, lvvwu, lvvwv, lvvxt, lvvxu, lvvxv, lvvyt, lvvyu, lvvyv, lvvzt, lvvzu, lvvzv]"));
        sum7();
    }


}
