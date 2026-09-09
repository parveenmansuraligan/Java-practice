import java.util.*;
import java.util.function.Function;
public class functiondemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(89);
        list.add(87);
        System.out.println(list);
        Function<Integer,String> f=num->"Number" +num;
        list.forEach(num-> {
            String r = f.apply(num);
            System.out.println(r);
        });
    }
}
