import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool fj = ForkJoinPool.commonPool();
        FindFibonacci findFibonacci = new FindFibonacci(50);

        long output = -(fj.invoke(findFibonacci));
        System.out.println(output);
    }
}
