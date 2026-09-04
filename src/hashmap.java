import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "ravi");
        map.put(102, "anu");
        map.put(103, "ram");
        map.put(104, "ken");
        System.out.println(map);
        map.remove(102);
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("king"));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }}



