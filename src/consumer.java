import java.util.*;
import java.util.function.Consumer;
public class consumer
{
public static void main(String args[])
{
    ArrayList<Integer> list=new ArrayList<>();
    list.add(2);
    list.add(89);
    list.add(4);
    System.out.println(list);
    Consumer<Integer> c=num->System.out.println(num);
    list.forEach(c);
}}
