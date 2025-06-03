import java.lang.reflect.Array;
import java.util.*;

public class FindShortestDistanceFromGivenString {
    public static void main(String[] args) {
        String str = "loveleetcode";
//        String str = "aaab";
        Character findingCharacter = 'e';
        System.out.println(Arrays.toString(findShortestDistance(str,findingCharacter )));
        Set<List<Integer>> listOfSet = new HashSet<>();
        List<List<Integer>> listOfInteger = new ArrayList<>();
            for(List<Integer> list : listOfSet){
                listOfInteger.add(list);

            }
//        0 1 2 3 4 5 6 7 8 9 10 11
//        l o v e l e e t c o  d  e
//        3 2 1 0 1 0 0 1 2 2  1  0
    }

    static int[] findShortestDistance(String s, Character findingCharacter   ) {
        if (s == null || s.isBlank())
            return new int[0];
        if (!s.contains(Character.toString(findingCharacter)))
            throw new IllegalArgumentException("Target character not found in the string.");

        int n = s.length();
        int[] result = new int[n];
        int prev = Integer.MIN_VALUE / 2;  // Use this to avoid overflow in subtraction

        // Left to right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == findingCharacter) {
                prev = i;
            }
            result[i] = i - prev;
        }

        // Right to left
        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == findingCharacter) {
                prev = i;
            }
            result[i] = Math.min(result[i], prev - i);
        }

        return result;
    }
}
