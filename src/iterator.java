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
        Iterator<Integer> n=list.iterator();
        while(n.hasNext())
        {
            Integer number=n.next();
            if(number%2==0)
            {
                n.remove();
            }
        }
        System.out.println(list);
    }
}
