
import java.util.Arrays;
import java.util.*;
class Demo {
    public static void main(String[] args) {
        TreeSet<Double> a=new TreeSet<>();
        TreeSet<Double> b=new TreeSet<>();
        a.add(10.5);
        a.add(20.2);
        a.add(11.3);
        a.add(15.5);
        a.add(11.5);
        System.out.println(a);
        System.out.println(a.remove(11.3));
        System.out.println(a.size());
        System.out.println(a);
        System.out.println(a.contains(12.5));
        System.out.println(a.isEmpty());
        b.addAll(a);
        System.out.println(b);
        System.out.println(a.lower(15.5));
        System.out.println(a.floor(15.2));
    }}