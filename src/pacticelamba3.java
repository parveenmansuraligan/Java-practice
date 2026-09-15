import java.util.*;
import java.util.function.Predicate;
public class pacticelamba3 {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(12);
        Predicate<Integer> p=num->(num%2==0);
        list.forEach(num->{if(p.test(num))
        System.out.println(num+" " +"even");
        });
    }
}
