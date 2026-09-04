import java.util.*;
public class Hashmapentry {
    public static void main(String args[])
    {HashMap<Integer,String> map=new HashMap<>();
        map.put(101,"ken");
        map.put(102,"ram");
        map.put(103,"raj");
        System.out.println(map);
        for(Map.Entry<Integer,String> entry:map.entrySet()) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }
        }
    }

