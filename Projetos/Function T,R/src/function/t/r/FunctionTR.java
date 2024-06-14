package function.t.r;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import static java.util.stream.Collectors.toList;

public class FunctionTR {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(toList());

        numerosDobrados.forEach(System.out::println);
    }
}
