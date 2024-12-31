import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practical10C{
    public static void main(String[] args) {
        // Use generics for better type safety
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Asmit");
        map.put(2, "Atharva");
        map.put(3, "Trevor");
        map.put(4, "Michale");
        map.put(5, "Franklin");

        // Obtain the entry set from the map
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        // Iterate through the entries and print them
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

