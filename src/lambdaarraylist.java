import java.util.*;
public class lambdaarraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(20);
        System.out.println(a);
        Iterator l=a.iterator();//using iterator
        while(l.hasNext()) {
            System.out.println(l.next());
        }
        for(Integer number:a) {//for each
            System.out.println(number);
        }
            a.forEach(num-> System.out.println(num));//lambda
    }
}
