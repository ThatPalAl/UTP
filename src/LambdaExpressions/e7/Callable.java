package LambdaExpressions.e7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Callable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        String s = "Ala ma kota i psa";
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<String> task = ex.submit(() -> {
            char[] src = s.toCharArray();
            char[] trgt = new char[src.length];
            for(int i = src.length - 1, j = 0; i >= 0; i--, j++){
                trgt[j] = src[i];
                System.out.println(trgt[j]);
                Thread.sleep(1000);
            }
            return new String(trgt);
        });
        String res = task.get();
        System.out.println(res);
    }
}
