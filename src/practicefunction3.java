
import java.util.*;
import java.util.function.Function;
public class practicefunction3 {
    public static void main(String args[])
    {
        ArrayList<Double> list=new ArrayList<>();
        list.add(10.2);
        list.add(12.2);
        Function<Double,Double> f =num->num*3;
        for(Double num:list)
        {
            double r=f.apply(num);
            System.out.println(r);
        }
    }
}
