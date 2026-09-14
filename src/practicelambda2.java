import java.util.*;
import java.util.function.Function;
public class practicelambda2 {
    public static void main(
            String args[])
    {
     HashSet<String> set=new HashSet<>();
     set.add("ken");
     set.add("bob");
     set.add("pom");
     Function<String,String> f=name->name.toUpperCase();
     for(String name:set){
         String r=f.apply(name);
     System.out.println(r);
    }}
}
