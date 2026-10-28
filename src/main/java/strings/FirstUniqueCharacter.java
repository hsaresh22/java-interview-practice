
package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static int solve(String s) {
        // Your implementation here
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c:s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }

//        if (!countMap.containsValue(1)) return -1;
        for(Map.Entry<Character,Integer> entry: countMap.entrySet()){
            if (entry.getValue() == 1){
                return s.indexOf(entry.getKey());
            }
        }

       return -1;
    }
}
