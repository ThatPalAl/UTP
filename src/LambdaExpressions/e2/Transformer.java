package LambdaExpressions.e2;

public interface Transformer<T, S> {
    T transform(S v);
}