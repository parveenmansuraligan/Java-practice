import java.util.*;
public class arraylist3
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(43);
        list.add(100);
        list.add(100);
        list.add(34);
        System.out.println(list);
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                    System.out.println(list.get(i));

            }
        }
    }}