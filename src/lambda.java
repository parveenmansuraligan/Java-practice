interface LambdaDemo {
    void show(int a, int b);
}
public class lambda {
    public static void main(String[] args) {
        LambdaDemo l = (a, b) -> System.out.println(a + b);
        l.show(10, 11);

    }
}
