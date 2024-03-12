package Generics.e2;

class MinMax<T> {
    private T min;
    private T max;

    public MinMax(T f, T l) {
        min = f;
        max = l;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }
}
