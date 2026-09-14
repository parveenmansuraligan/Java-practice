import javax.swing.*;

interface NumberCheck {

    boolean check(int n);
}
public class customfunctionalinterface {
    public static void main(String args[])
    {
        NumberCheck nc=n->(n%2==0);
        if (nc.check(10))
         {
        System.out.println("10 is even");
        }
        else
    {
System.out.println("10 is odd");
    }
    }}