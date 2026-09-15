import java.util.*;
import java.util.function.Supplier;
public class pacticelamba3 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hai");
        list.add("jello");
        list.add("god");
        Supplier<String> s = () -> "welcome to auto";
        String r = s.get();
        System.out.println(r);
    }}
