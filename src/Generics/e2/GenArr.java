package Generics.e2;

public class GenArr <T extends Comparable<T>>{
    private T[] arr;
    private MinMax<T> minMax;

    public GenArr(T[] a){
        init(a);
    }

    public void init(T[] a ){
        minMax = null;
        arr = a;
    }

    public MinMax<T> getMinMax(){
        if(minMax != null){
            return minMax;
        }
        if(arr == null || arr.length == 0){
            return null;
        }
        T min = arr[0];
        T max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i].compareTo(min) < 0){
                min = arr[i];
            }
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        minMax = new MinMax<>(min, max);
        return minMax;
    }
}

