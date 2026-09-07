import java.util.*;
import java.util.function.Predicate;
public class lambdaforeach {
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(30);
        set.add(80);
        set.add(20);
        System.out.println(set);
        Predicate<Integer> p=number->number>20;
        set.forEach(number->{if(p.test(number))
        {
            System.out.println(number);
        }});
    }
}
