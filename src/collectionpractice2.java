import java.util.*;
public class collectionpractice2 {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(19);
        list.add(11);
        list.add(2);
        HashSet<Integer> set=new HashSet<>(list);
        System.out.println(set);

    }
}
