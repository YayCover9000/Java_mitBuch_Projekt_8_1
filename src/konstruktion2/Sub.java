package konstruktion2;

public class Sub extends Super {
    private int number;

    public Sub() {
        number = 4711;
    }

    @Override
    public void doSomething() {
        System.out.println(number);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
