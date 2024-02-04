package com.cleo.JBDL.dsa;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostOccurrences {

    public static char maxRepeatingCharacter(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()) {
            if(!Character.isWhitespace(c))
                map.compute(c, (k, v) -> v == null ? 1 : ++v);
        }
        int max= Collections.max(map.values());char c=Character.MIN_VALUE;
        for(var m:map.entrySet()){
            if(m.getValue()==max)
                return c;
        }
        return c;

    }
}
