import java.util.HashMap;
import java.util.Map;

public class ConcurrerException {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println("Map size : "+map.size());
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getKey().equals("c") )
                map.put("e",6);

        }

    }
}
