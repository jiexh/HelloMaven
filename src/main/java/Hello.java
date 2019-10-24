public class Hello {

    public static void main(String[] args) {
        Hello h1 = new Hello();
        System.out.println(h1.add(1, 8));
    }

    public Hello() {
        System.out.println("hello");
    }

    public int add(int a, int b) {
        return a + b;
    }

}
