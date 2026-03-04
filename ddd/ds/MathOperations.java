public class MathOperations {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 3;

        // arithmetic
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // unary
        System.out.println(a++);
        System.out.println(++a);

        // assignment
        a += 5;
        System.out.println(a);

        // relational
        System.out.println(a > b);
        System.out.println(a == b);

        // logical
        System.out.println(true && false);
        System.out.println(true || false);

        // ternary
        String msg = (a > b) ? "a is bigger" : "b is bigger";
        System.out.println(msg);
    }
}