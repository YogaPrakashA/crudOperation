import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "maddamr";
        System.out.println(findFirstNonRepeatedChar(input.toCharArray()));

    }

    static Character findFirstNonRepeatedChar(char[] chars) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < chars.length; i++)
                map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);


        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}
