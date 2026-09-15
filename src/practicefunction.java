import java.util.*;
import java.util.function.Function;
public class practicefunction {
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(23);
        set.add(4);
        set.add(12);
        Function<Integer,Integer> f=num->num*num;
        set.forEach(num->{
            int r= f.apply(num);
        System.out.println(r);
        });

    }
}
