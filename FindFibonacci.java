import java.util.concurrent.RecursiveTask;

public class FindFibonacci extends RecursiveTask<Long> {
    private long fib;

    public FindFibonacci(long fib) {
        this.fib = fib;
    }

    @Override
    protected Long compute() {
        if (fib <= 0) {
            return fib;
        } else {
            FindFibonacci f1 = new FindFibonacci(fib - 1);
            f1.fork();
            FindFibonacci f2 = new FindFibonacci(fib - 2);
            return f1.join() + f2.compute();
        }
    }
}
