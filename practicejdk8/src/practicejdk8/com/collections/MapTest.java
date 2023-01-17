package practicejdk8.com.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {

    public static void main(String[] args) {
        var m = new HashMap<String, Integer>();
        m.put("C", 153);
        m.put("A", 143);
        m.put("B", 133);
        var sortedByKeys = m.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
        System.out.println(sortedByKeys);
        var sortedMapByValues = m.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x, y) -> y, LinkedHashMap::new));
        System.out.println(sortedMapByValues);
    }
}
