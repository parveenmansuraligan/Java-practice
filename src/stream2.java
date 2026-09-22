import java.util.*;
public class stream2 {
    public static void main(String args[])
    {
        List<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(22);
        number.add(20);
        number.add(30);
        number.stream().sorted().forEach(n->System.out.println(n));
    }
}
