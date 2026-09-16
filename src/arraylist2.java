import java.util.*;
public class arraylist2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
HashSet<Integer> set=new HashSet<>();
for(int num:list)
    if(!(set.add(num)))
        System.out.println("Duplicate:" +num);
    }
}
