package LambdaExpressions.e8;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface IFunc {

    static <T> List<T> findAll(Collection<T> src, Predicate<T> p){
        List<T> trg = new ArrayList<>();
        for(T e : src){
            if(p.test(e)){
                trg.add(e);
            }
        }
        return trg;
    }

    static <S, T> List<T> transform(Collection<S> src, Function<S,T> f){
        List<T> trg = new ArrayList<>();
        for(S e : src){
            trg.add(f.apply(e));
        }
        return trg;
    }

    static <T> List<T> generate(int n, Supplier<T> s){
        List<T> trg = new ArrayList<>();
        for(int i = 0; i < n; i++){
            trg.add(s.get());
        }
        return trg;
    }

    static <T> void process(Collection<T> src, Consumer<T> c){
        for(T e : src){
            c.accept(e);
        }
    }
}
