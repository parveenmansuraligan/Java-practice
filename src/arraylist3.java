import java.util.*;
public class arraylist3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(43);
        list.add(100);
        int l=list.get(0);
        int sl=list.get(0);
        for(int num:list) {
            if (num>l) {
                sl=l;
                l=num;
            }
            if (sl != l && sl > num) {
                sl = num;
            }}
                System.out.println("largest" + l);
                System.out.println("Second largest" + sl);
        }
    }

