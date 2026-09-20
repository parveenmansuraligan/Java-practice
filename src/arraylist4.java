
import java.util.*;
public class arraylist4 {
    public static void main(String args[]) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(2);
        System.out.println(list);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:list)
        {
        if(map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
        }
        else {
            map.put(num,1);
        }}
        System.out.println(map);
        }

    }