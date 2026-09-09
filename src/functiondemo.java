import java.util.*;
import java.util.function.Function;
public class functiondemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(7);
        System.out.println(list);
        Function<Integer,Integer> f=num->num+5;
        list.forEach(num-> {
            int r = f.apply(num);
            System.out.println(r);
        });
    }
}
