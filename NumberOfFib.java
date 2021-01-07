public class NumberOfFib {
    public static void main(String[] args) {
        long findFiftiethFib = fib(50);
        System.out.println(findFiftiethFib);
    }
    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        else return fib(n - 1) + fib(n - 2);
    }
}
