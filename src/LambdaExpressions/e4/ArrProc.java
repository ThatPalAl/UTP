package LambdaExpressions.e4;

import java.util.Arrays;

public class ArrProc {

    public static <T> void processArr(T[] arr, Processor<T> p){
        for(int i = 0; i < arr.length; i++){
            arr[i] = p.process(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] sa = {"a" , "b", "c"};
        Integer[] ia = {1,2,3};
        processArr(sa, v -> v+ 1);
        processArr(ia, v -> v+ 1);
        processArr(sa, v -> v.toUpperCase());
        processArr(ia, v -> v * v);
        System.out.println(Arrays.toString(sa));
        System.out.println(Arrays.toString(ia));
    }
}
