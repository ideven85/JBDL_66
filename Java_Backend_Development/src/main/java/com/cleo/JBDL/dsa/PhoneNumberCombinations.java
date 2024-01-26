package com.cleo.JBDL.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class keypad {
    public static String getOptions(int digit) {
        switch (digit) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "xwyz";
            default:
                return "";
        }
    }

    public static String[] KeypadCombinations(int input) {
        if (input == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }

        String[] smallOutput = KeypadCombinations(input / 10);
        int lastDigit = input % 10;
        String lastDigitOptions = getOptions(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOptions.length()];
        int K = 0;
        for (String string : smallOutput) {
            for (int j = 0; j < lastDigitOptions.length(); j++) {
                output[K] = string + lastDigitOptions.charAt(j);
                K++;
            }
        }
        return output;
    }
    private static final ArrayList<String> result=new ArrayList<>();

    static ArrayList <String> possibleWords(int a[], int N) {
        // your code here
        int n = 0;
        int j=0;
        for (int i = 0; i <N ; i++) {
            n=n*10+a[i];
        }
        String[] s = KeypadCombinations(n);
       // System.out.println(Arrays.toString(s));

        result.addAll(Arrays.asList(s));
        Collections.sort(result);

        for(String s1: result)
            System.out.print(s1 + " ");
        result.remove(result.size()-1);
        System.out.println();
        return result;

    }
//[jttwt, jttwu, jttwv, jttxt, jttxu, jttxv, jttyt, jttyu, jttyv, jttzt, jttzu, jttzv, jtuwt, jtuwu, jtuwv, jtuxt, jtuxu, jtuxv, jtuyt, jtuyu, jtuyv, jtuzt, jtuzu, jtuzv, jtvwt, jtvwu, jtvwv, jtvxt, jtvxu, jtvxv, jtvyt, jtvyu, jtvyv, jtvzt, jtvzu, jtvzv, jutwt, jutwu, jutwv, jutxt, jutxu, jutxv, jutyt, jutyu, jutyv, jutzt, jutzu, jutzv, juuwt, juuwu, juuwv, juuxt, juuxu, juuxv, juuyt, juuyu, juuyv, juuzt, juuzu, juuzv, juvwt, juvwu, juvwv, juvxt, juvxu, juvxv, juvyt, juvyu, juvyv, juvzt, juvzu, juvzv, jvtwt, jvtwu, jvtwv, jvtxt, jvtxu, jvtxv, jvtyt, jvtyu, jvtyv, jvtzt, jvtzu, jvtzv, jvuwt, jvuwu, jvuwv, jvuxt, jvuxu, jvuxv, jvuyt, jvuyu, jvuyv, jvuzt, jvuzu, jvuzv, jvvwt, jvvwu, jvvwv, jvvxt, jvvxu, jvvxv, jvvyt, jvvyu, jvvyv, jvvzt, jvvzu, jvvzv, kttwt, kttwu, kttwv, kttxt, kttxu, kttxv, kttyt, kttyu, kttyv, kttzt, kttzu, kttzv, ktuwt, ktuwu, ktuwv, ktuxt, ktuxu, ktuxv, ktuyt, ktuyu, ktuyv, ktuzt, ktuzu, ktuzv, ktvwt, ktvwu, ktvwv, ktvxt, ktvxu, ktvxv, ktvyt, ktvyu, ktvyv, ktvzt, ktvzu, ktvzv, kutwt, kutwu, kutwv, kutxt, kutxu, kutxv, kutyt, kutyu, kutyv, kutzt, kutzu, kutzv, kuuwt, kuuwu, kuuwv, kuuxt, kuuxu, kuuxv, kuuyt, kuuyu, kuuyv, kuuzt, kuuzu, kuuzv, kuvwt, kuvwu, kuvwv, kuvxt, kuvxu, kuvxv, kuvyt, kuvyu, kuvyv, kuvzt, kuvzu, kuvzv, kvtwt, kvtwu, kvtwv, kvtxt, kvtxu, kvtxv, kvtyt, kvtyu, kvtyv, kvtzt, kvtzu, kvtzv, kvuwt, kvuwu, kvuwv, kvuxt, kvuxu, kvuxv, kvuyt, kvuyu, kvuyv, kvuzt, kvuzu, kvuzv, kvvwt, kvvwu, kvvwv, kvvxt, kvvxu, kvvxv, kvvyt, kvvyu, kvvyv, kvvzt, kvvzu, kvvzv, lttwt, lttwu, lttwv, lttxt, lttxu, lttxv, lttyt, lttyu, lttyv, lttzt, lttzu, lttzv, ltuwt, ltuwu, ltuwv, ltuxt, ltuxu, ltuxv, ltuyt, ltuyu, ltuyv, ltuzt, ltuzu, ltuzv, ltvwt, ltvwu, ltvwv, ltvxt, ltvxu, ltvxv, ltvyt, ltvyu, ltvyv, ltvzt, ltvzu, ltvzv, lutwt, lutwu, lutwv, lutxt, lutxu, lutxv, lutyt, lutyu, lutyv, lutzt, lutzu, lutzv, luuwt, luuwu, luuwv, luuxt, luuxu, luuxv, luuyt, luuyu, luuyv, luuzt, luuzu, luuzv, luvwt, luvwu, luvwv, luvxt, luvxu, luvxv, luvyt, luvyu, luvyv, luvzt, luvzu, luvzv, lvtwt, lvtwu, lvtwv, lvtxt, lvtxu, lvtxv, lvtyt, lvtyu, lvtyv, lvtzt, lvtzu, lvtzv, lvuwt, lvuwu, lvuwv, lvuxt, lvuxu, lvuxv, lvuyt, lvuyu, lvuyv, lvuzt, lvuzu, lvuzv, lvvwt, lvvwu, lvvwv, lvvxt, lvvxu, lvvxv, lvvyt, lvvyu, lvvyv, lvvzt, lvvzu, lvvzv]
//jttwt jttwu jttwv jttxt jttxu jttxv jttyt jttyu jttyv jttzt jttzu jttzv jtuwt jtuwu jtuwv jtuxt jtuxu jtuxv jtuyt jtuyu jtuyv jtuzt jtuzu jtuzv jtvwt jtvwu jtvwv jtvxt jtvxu jtvxv jtvyt jtvyu jtvyv jtvzt jtvzu jtvzv jutwt jutwu jutwv jutxt jutxu jutxv jutyt jutyu jutyv jutzt jutzu jutzv juuwt juuwu juuwv juuxt juuxu juuxv juuyt juuyu juuyv juuzt juuzu juuzv juvwt juvwu juvwv juvxt juvxu juvxv juvyt juvyu juvyv juvzt juvzu juvzv jvtwt jvtwu jvtwv jvtxt jvtxu jvtxv jvtyt jvtyu jvtyv jvtzt jvtzu jvtzv jvuwt jvuwu jvuwv jvuxt jvuxu jvuxv jvuyt jvuyu jvuyv jvuzt jvuzu jvuzv jvvwt jvvwu jvvwv jvvxt jvvxu jvvxv jvvyt jvvyu jvvyv jvvzt jvvzu jvvzv kttwt kttwu kttwv kttxt kttxu kttxv kttyt kttyu kttyv kttzt kttzu kttzv ktuwt ktuwu ktuwv ktuxt ktuxu ktuxv ktuyt ktuyu ktuyv ktuzt ktuzu ktuzv ktvwt ktvwu ktvwv ktvxt ktvxu ktvxv ktvyt ktvyu ktvyv ktvzt ktvzu ktvzv kutwt kutwu kutwv kutxt kutxu kutxv kutyt kutyu kutyv kutzt kutzu kutzv kuuwt kuuwu kuuwv kuuxt kuuxu kuuxv kuuyt kuuyu kuuyv kuuzt kuuzu kuuzv kuvwt kuvwu kuvwv kuvxt kuvxu kuvxv kuvyt kuvyu kuvyv kuvzt kuvzu kuvzv kvtwt kvtwu kvtwv kvtxt kvtxu kvtxv kvtyt kvtyu kvtyv kvtzt kvtzu kvtzv kvuwt kvuwu kvuwv kvuxt kvuxu kvuxv kvuyt kvuyu kvuyv kvuzt kvuzu kvuzv kvvwt kvvwu kvvwv kvvxt kvvxu kvvxv kvvyt kvvyu kvvyv kvvzt kvvzu kvvzv lttwt lttwu lttwv lttxt lttxu lttxv lttyt lttyu lttyv lttzt lttzu lttzv ltuwt ltuwu ltuwv ltuxt ltuxu ltuxv ltuyt ltuyu ltuyv ltuzt ltuzu ltuzv ltvwt ltvwu ltvwv ltvxt ltvxu ltvxv ltvyt ltvyu ltvyv ltvzt ltvzu ltvzv lutwt lutwu lutwv lutxt lutxu lutxv lutyt lutyu lutyv lutzt lutzu lutzv luuwt luuwu luuwv luuxt luuxu luuxv luuyt luuyu luuyv luuzt luuzu luuzv luvwt luvwu luvwv luvxt luvxu luvxv luvyt luvyu luvyv luvzt luvzu luvzv lvtwt lvtwu lvtwv lvtxt lvtxu lvtxv lvtyt lvtyu lvtyv lvtzt lvtzu lvtzv lvuwt lvuwu lvuwv lvuxt lvuxu lvuxv lvuyt lvuyu lvuyv lvuzt lvuzu lvuzv lvvwt lvvwu lvvwv lvvxt lvvxu lvvxv lvvyt lvvyu lvvyv lvvzt lvvzu lvvzv
//jttwt jttwu jttwv jttxt jttxu jttxv jttyt jttyu jttyv jttzt jttzu jttzv jtuwt jtuwu jtuwv jtuxt jtuxu jtuxv jtuyt jtuyu jtuyv jtuzt jtuzu jtuzv jtvwt jtvwu jtvwv jtvxt jtvxu jtvxv jtvyt jtvyu jtvyv jtvzt jtvzu jtvzv jutwt jutwu jutwv jutxt jutxu jutxv jutyt jutyu jutyv jutzt jutzu jutzv juuwt juuwu juuwv juuxt juuxu juuxv juuyt juuyu juuyv juuzt juuzu juuzv juvwt juvwu juvwv juvxt juvxu juvxv juvyt juvyu juvyv juvzt juvzu juvzv jvtwt jvtwu jvtwv jvtxt jvtxu jvtxv jvtyt jvtyu jvtyv jvtzt jvtzu jvtzv jvuwt jvuwu jvuwv jvuxt jvuxu jvuxv jvuyt jvuyu jvuyv jvuzt jvuzu jvuzv jvvwt jvvwu jvvwv jvvxt jvvxu jvvxv jvvyt jvvyu jvvyv jvvzt jvvzu jvvzv kttwt kttwu kttwv kttxt kttxu kttxv kttyt kttyu kttyv kttzt kttzu kttzv ktuwt ktuwu ktuwv ktuxt ktuxu ktuxv ktuyt ktuyu ktuyv ktuzt ktuzu ktuzv ktvwt ktvwu ktvwv ktvxt ktvxu ktvxv ktvyt ktvyu ktvyv ktvzt ktvzu ktvzv kutwt kutwu kutwv kutxt kutxu kutxv kutyt kutyu kutyv kutzt kutzu kutzv kuuwt kuuwu kuuwv kuuxt kuuxu kuuxv kuuyt kuuyu kuuyv kuuzt kuuzu kuuzv kuvwt kuvwu kuvwv kuvxt kuvxu kuvxv kuvyt kuvyu kuvyv kuvzt kuvzu kuvzv kvtwt kvtwu kvtwv kvtxt kvtxu kvtxv kvtyt kvtyu kvtyv kvtzt kvtzu kvtzv kvuwt kvuwu kvuwv kvuxt kvuxu kvuxv kvuyt kvuyu kvuyv kvuzt kvuzu kvuzv kvvwt kvvwu kvvwv kvvxt kvvxu kvvxv kvvyt kvvyu kvvyv kvvzt kvvzu kvvzv lttwt lttwu lttwv lttxt lttxu lttxv lttyt lttyu lttyv lttzt lttzu lttzv ltuwt ltuwu ltuwv ltuxt ltuxu ltuxv ltuyt ltuyu ltuyv ltuzt ltuzu ltuzv ltvwt ltvwu ltvwv ltvxt ltvxu ltvxv ltvyt ltvyu ltvyv ltvzt ltvzu ltvzv lutwt lutwu lutwv lutxt lutxu lutxv lutyt lutyu lutyv lutzt lutzu lutzv luuwt luuwu luuwv luuxt luuxu luuxv luuyt luuyu luuyv luuzt luuzu luuzv luvwt luvwu luvwv luvxt luvxu luvxv luvyt luvyu luvyv luvzt luvzu luvzv lvtwt lvtwu lvtwv lvtxt lvtxu lvtxv lvtyt lvtyu lvtyv lvtzt lvtzu lvtzv lvuwt lvuwu lvuwv lvuxt lvuxu lvuxv lvuyt lvuyu lvuyv lvuzt lvuzu lvuzv lvvwt lvvwu lvvwv lvvxt lvvxu lvvxv lvvyt lvvyu lvvyv lvvzt lvvzu lvvzv
//jttwt jttwu jttwv jttxt jttxu jttxv jttyt jttyu jttyv jttzt jttzu jttzv jtuwt jtuwu jtuwv jtuxt jtuxu jtuxv jtuyt jtuyu jtuyv jtuzt jtuzu jtuzv jtvwt jtvwu jtvwv jtvxt jtvxu jtvxv jtvyt jtvyu jtvyv jtvzt jtvzu jtvzv jutwt jutwu jutwv jutxt jutxu jutxv jutyt jutyu jutyv jutzt jutzu jutzv juuwt juuwu juuwv juuxt juuxu juuxv juuyt juuyu juuyv juuzt juuzu juuzv juvwt juvwu juvwv juvxt juvxu juvxv juvyt juvyu juvyv juvzt juvzu juvzv jvtwt jvtwu jvtwv jvtxt jvtxu jvtxv jvtyt jvtyu jvtyv jvtzt jvtzu jvtzv jvuwt jvuwu jvuwv jvuxt jvuxu jvuxv jvuyt jvuyu jvuyv jvuzt jvuzu jvuzv jvvwt jvvwu jvvwv jvvxt jvvxu jvvxv jvvyt jvvyu jvvyv jvvzt jvvzu jvvzv kttwt kttwu kttwv kttxt kttxu kttxv kttyt kttyu kttyv kttzt kttzu kttzv ktuwt ktuwu ktuwv ktuxt ktuxu ktuxv ktuyt ktuyu ktuyv ktuzt ktuzu ktuzv ktvwt ktvwu ktvwv ktvxt ktvxu ktvxv ktvyt ktvyu ktvyv ktvzt ktvzu ktvzv kutwt kutwu kutwv kutxt kutxu kutxv kutyt kutyu kutyv kutzt kutzu kutzv kuuwt kuuwu kuuwv kuuxt kuuxu kuuxv kuuyt kuuyu kuuyv kuuzt kuuzu kuuzv kuvwt kuvwu kuvwv kuvxt kuvxu kuvxv kuvyt kuvyu kuvyv kuvzt kuvzu kuvzv kvtwt kvtwu kvtwv kvtxt kvtxu kvtxv kvtyt kvtyu kvtyv kvtzt kvtzu kvtzv kvuwt kvuwu kvuwv kvuxt kvuxu kvuxv kvuyt kvuyu kvuyv kvuzt kvuzu kvuzv kvvwt kvvwu kvvwv kvvxt kvvxu kvvxv kvvyt kvvyu kvvyv kvvzt kvvzu kvvzv lttwt lttwu lttwv lttxt lttxu lttxv lttyt lttyu lttyv lttzt lttzu lttzv ltuwt ltuwu ltuwv ltuxt ltuxu ltuxv ltuyt ltuyu ltuyv ltuzt ltuzu ltuzv ltvwt ltvwu ltvwv ltvxt ltvxu ltvxv ltvyt ltvyu ltvyv ltvzt ltvzu ltvzv lutwt lutwu lutwv lutxt lutxu lutxv lutyt lutyu lutyv lutzt lutzu lutzv luuwt luuwu luuwv luuxt luuxu luuxv luuyt luuyu luuyv luuzt luuzu luuzv luvwt luvwu luvwv luvxt luvxu luvxv luvyt luvyu luvyv luvzt luvzu luvzv lvtwt lvtwu lvtwv lvtxt lvtxu lvtxv lvtyt lvtyu lvtyv lvtzt lvtzu lvtzv lvuwt lvuwu lvuwv lvuxt lvuxu lvuxv lvuyt lvuyu lvuyv lvuzt lvuzu lvuzv lvvwt lvvwu lvvwv lvvxt lvvxu lvvxv lvvyt lvvyu lvvyv lvvzt lvvzu lvvzv
    public static void main (String[] args) {
        int[] a = {5,8,8,9,8};
        System.out.println(possibleWords(a,a.length));


    }
}

public class PhoneNumberCombinations {



 static   class KeyPadCombinations {
        private static final List<String> result=new ArrayList<>();
        private static String[] s1;
        public static String[] keypad(int n){
            // Write your code here
            if(n==0){
                String[] output = new String[1];
                output[0]="";
                return output;
            }
            String s = String.valueOf(n);
            int[] input = new int[s.length()];
            int t = n;
            for (int i = 0; i < input.length; i++) {
                input[i]=t%10;
                t/=10;
            }
            //Serious Doubt
       /* String[] current=keypad(n/10);
        String[] output = new String[current.length*2];
        System.arraycopy(current,0,output,0,current.length);
        String input = keyPadNumbers(n%10);
        for (int i = 0; i < current.length; i++) {
            assert input != null;
            output[current.length+i]=input.charAt(0)+current[i];
        }*/
            //   List<String> output = new ArrayList<>();

//23-> 2="abc",3="def" output=> ad,ae,af,bd,be,bf,cd,ce,cf

            //System.arraycopy(current,0,output,0,current.length);

            char[] output = new char[input.length];


            keyPadHelper(input,0,output);
            s1 = new String[result.size()];
            for (int i = 0; i < result.size(); i++) {
                s1[i]=new StringBuilder(result.get(i)).reverse().toString();
            }
            return s1;

        }
        private static void keyPadHelper(int[] input, int pos, char[] output){
            if(pos==input.length){
                StringBuilder temp= new StringBuilder();
                for (int i = 0; i < input.length; i++) {
                    if(output[i]=='\0')
                        temp.append("");
                    else
                        temp.append(output[i]);
                }
                result.add(temp.toString());
                return;
            }
            String str=getKeyPadNumbers(input[pos]);


            if(str.isEmpty()){
                result.add("");
                keyPadHelper(input,pos+1,output);
            }else

                for (char c : str.toCharArray()) {
                    output[pos] = c;
                    keyPadHelper(input, pos + 1, output);
                }

        }
        private static String getKeyPadNumbers(int n){
            switch (n){
                case 2: return "abc";
                case 3: return "def";
                case 4: return "ghi";
                case 5: return "jkl";
                case 6: return "mno";
                case 7: return "pqrs";
                case 8: return "tuv";
                case 9: return "xwyz";
                default: return "";
            }
        }
        public static void printKeypad(int input){
            // Write your code here
            keypad(input);
            Arrays.sort(s1);
            for(String s:s1)
                System.out.print(s + " ");

        }

        public static void main(String[] args) {
            int n = 65598;
            System.out.println(Arrays.toString(keypad(n)));
            printKeypad(65598);
        }
    }


}
