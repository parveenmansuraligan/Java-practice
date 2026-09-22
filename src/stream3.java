import java.util.*;
public class stream3
{
public static void main(String[] args)
{
    ArrayList<Integer> list=new ArrayList<>();
    list.add(12);
    list.add(34);
    list.add(1);
    list.add(9);
    long count=list.stream().filter(n->n>2).count();
    System.out.println(count);
}}
