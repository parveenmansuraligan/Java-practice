interface LambdaDemo {
    int show(int a, int b);
}
public class lambda {
    public static void main(String[] args) {
        LambdaDemo l = (a, b) ->(a+b);
        int r=l.show(10, 11);
        System.out.println(r);
    }
}
