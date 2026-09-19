import java.util.*;
public class arraylist3
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(43);
        list.add(100);
        list.add(100);
        list.add(34);
        System.out.println(list);
        list1.add(34);
        list1.add(78);
        list1.add(100);
        list1.add(20);
        System.out.println(list1);
        for (int num : list1) {
            if (list.contains(num)) {
                System.out.println(num);
            }
        }
    }}