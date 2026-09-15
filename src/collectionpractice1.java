import java.util.*;
public class collectionpractice1 {
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(21);
        list.add(17);
        list.add(5);
        list.add(99);
        int l=list.get(0);
        int s=list.get(0);
        for(int num:list)
        {
            if(num>l){
            l=num;
        }
            if(num<s)
            {
                s=num;
            }}
        System.out.println("largest" +l);
        System.out.println("Smallest" +s);
    }
}
