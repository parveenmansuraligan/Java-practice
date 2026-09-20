import java.util.*;
public class stream1 {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(1);
        list.add(34);
        list.add(21);
        list.add(12);
        list.stream().forEach(num->System.out.println(num));
        list.stream().filter(num->num%2==0).forEach(num->System.out.println("Even:" +num));
    }}

