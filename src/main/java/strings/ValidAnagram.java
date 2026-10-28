
package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static boolean solve(String s, String t) {
        // Your implementation here
        if (s.length()!= t.length()) return false;

        Map<Character, Integer> mapCount = new HashMap<>();
        Map<Character, Integer> mapCount2 = new HashMap<>();
        for (char c: s.toCharArray()){
            mapCount.putIfAbsent(c,0);
            mapCount.put(c, mapCount.getOrDefault(c, 0) + 1);
        }

        for (char c: t.toCharArray()){
            mapCount2.putIfAbsent(c,0);
            mapCount2.put(c, mapCount2.getOrDefault(c, 0) + 1);
        }


//        for (Map.Entry<Character, Integer> entry: mapCount.entrySet()){
//            if ((!mapCount2.containsKey(entry.getKey())
//                    || !Objects.equals(mapCount2.get(entry.getKey()), entry.getValue())))
//            {
//                return false;
//            }
//        }

        return mapCount.equals(mapCount2);
    }
}
