package LambdaExpressions.e3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(5,72,10,11,9);
        List<Integer> target = src
                .stream()
                .filter( n -> n < 10)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(target);

        List<Integer> num = Arrays.asList(1,3,5,10,9,12,7);
        List<Integer> out =
                num.stream()
                        .map(n -> n * n)
                        .filter(n -> n > 80)
                        .collect(Collectors.toList());

        System.out.println(out);

        List<String> snum = Arrays.asList("7", "20", "160", "777", "822");
        snum = snum.stream()
                .filter(s -> s.length() == 3)
                .map(s -> Integer.parseInt(s))
                .filter(n -> n % 2 == 0)
                .map(n -> String.valueOf(n))
                .collect(Collectors.toList());

        System.out.println(snum);
    }
}
