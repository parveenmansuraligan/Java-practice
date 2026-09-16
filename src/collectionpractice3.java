import java.util.*;
public class collectionpractice3 {
    public static void main(String[] args)
    {
        String s="Hello";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        System.out.println(map);
    }
}
