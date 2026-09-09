import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class consumer
{
public static void main(String args[])
{
    TreeSet<Integer> t=new TreeSet<>();
    t.add(5);
    t.add(1);
    t.add(18);
    t.add(21);
    System.out.println(t);
    Predicate<Integer> p=num->(num>5 && num<20);
    Consumer<Integer> c=num->System.out.println(num);
    t.forEach(num->{if(p.test(num)) {
        c.accept(num);
    }});
    }
}
