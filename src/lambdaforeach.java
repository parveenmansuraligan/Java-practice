import java.util.*;
public class lambdaforeach {
    public static void main(String[] args)
    {
        HashSet<Integer> set=new HashSet<>();
        set.add(3);
        set.add(8);
        set.add(2);
        System.out.println(set);
        set.forEach(number->{if(number%2==0)
        {System.out.println(number);
        }});
    }
}
