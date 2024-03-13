package LambdaExpressions.e4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LamSample {

    static void arrOp(int[] arr, IntProcessor p){
        for(int i = 0; i < arr.length; i++){
            arr[i] = p.process(arr[i]);
        }
    }

    static void sarrOp(String[] arr, StringProcessor p){
        for(int i = 0; i < arr.length; i++){
            arr[i] = p.process(arr[i]);
        }
    }

    static IntProcessor getIntProcessor(){
        return (int n) -> {
            return +1;
        };
    }

    public static void main(String[] args) {
        IntProcessor p = (int n) -> {
            return n + 1;
        };
        int[] arr = {1,2,3};
        arrOp(arr,
                n -> n + 1
        );
        Object p1 = getIntProcessor();
        System.out.println(Arrays.toString(arr));
    }
}
