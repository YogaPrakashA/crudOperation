import java.util.*;

public class FindAnagram {
    public static void main(String[] args) {
      String[] input =   {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(findAnangramInGivenArray(input));
    }

    static HashMap<String , List<String>> findAnangramInGivenArray(String[] strings){
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s : strings){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedValue = new String(chars);

            if(!map.containsKey(sortedValue))
                map.put(sortedValue , new ArrayList<>());
            map.get(sortedValue).add(s);
        }
        for(Map.Entry<String,List<String>>  mp : map.entrySet()){

            System.out.println(mp.getValue());

        }
       // System.out.println(map.values());

        return map;
    }

}
