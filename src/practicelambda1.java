import java.util.*;
import java.util.function.Consumer;
public class practicelambda1
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(40);
        list.add(1);
        list.add(23);
        Consumer<Integer> c=num->System.out.println(num);
        list.forEach(c);

    }
}
