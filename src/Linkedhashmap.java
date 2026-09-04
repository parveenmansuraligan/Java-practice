import java.util.*;
public class Linkedhashmap {
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> link=new LinkedHashMap<>();
        link.put(2,"sita");
        link.put(3,"ken");
        link.put(1,"ram");
        System.out.println(link);
        HashMap<Integer,String> set=new HashMap<>(link);
        System.out.println(set);
    }
}
