import java.util.function.Supplier;
public class supplier {
    public static void main(String[] args)
    {
        Supplier<String> s=()->"hai";
        String r=s.get();
        System.out.println(r);
    }
}
