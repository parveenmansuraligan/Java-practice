import java.util.*;
public class array1 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(56);
        list.add(2);
        list.add(23);
        list.add(9);
        for(int i=list.size()-1;i>=0;i--)
            System.out.println(list.get(i));
        System.out.println(list.contains(20));
        System.out.println(list.remove(2));
        System.out.println(list);


    }
}