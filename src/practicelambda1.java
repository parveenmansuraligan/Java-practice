import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class practicelambda1
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(40);
        list.add(1);
        list.add(23);
        Predicate<Integer> p=num->(num%2==0);
        Consumer<Integer> even=num->System.out.println(num +"is even");
        Consumer<Integer> odd=num->System.out.println(num+"is odd");
        list.forEach(num->{if(p.test(num))
            {
                even.accept(num);
            }
            else
                odd.accept(num);});
        }

        }

