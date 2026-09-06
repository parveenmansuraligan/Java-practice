import java.util.*;
public class iterator
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(3);
        list.add(7);
        System.out.println(list);
        for(Integer number:list)
        {
            System.out.println(number);
        }
    }
}
