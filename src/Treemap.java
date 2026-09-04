import java.util.*;
public class Treemap {
    public static void main(String args[])
    {
        TreeMap<Integer,String> tree=new TreeMap<>();
        tree.put(14,"ram");
        tree.put(1,"Sita");
        tree.put(15,"ken");
        tree.put(4,"joe");
        System.out.println(tree);
        TreeMap<Integer,String> tree2=new TreeMap<>();
        tree2.putAll(tree);
        System.out.println(tree2);
        HashMap<Integer,String> map=new HashMap<>(tree);
        map.put(2,"kin");
        map.put(100,"i");
        System.out.println(map);

    }
}
