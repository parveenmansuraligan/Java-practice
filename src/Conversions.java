import java.util.*;
public class Conversions {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        HashSet<Integer> l = new HashSet<>(list);
        System.out.println(l);
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"anu");
        map.put(2,"ram");
        System.out.println(map);
        TreeSet<String> set=new TreeSet<>(map.values());
        System.out.println(set);

    }
}
