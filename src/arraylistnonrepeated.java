import java.util.*;
public class arraylistnonrepeated {
    public static void main(String args[])
    {
        String s="Programming";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
        }}
    for(char ch:s.toCharArray())
if(map.get(ch)==1)
{
System.out.println("first non repeating character"+ch);
break;
}
    }
}
