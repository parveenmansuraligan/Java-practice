import java.util.*;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
public class functioninterface {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(45);
        set.add(2);
        set.add(6);
        set.add(12);
        System.out.println(set);
        Predicate<Integer> p = num -> num < 20;
        Consumer<Integer> c = num -> System.out.println(num);
        Function<Integer, Integer> f = num -> num * 2;
        set.forEach(num -> {
               if(p.test(num)) {
                   int r = f.apply(num);
                   c.accept(r);
               }});
    }}


