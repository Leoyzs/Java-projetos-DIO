package Main;



import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        BinaryOperator<Integer> somar = Integer::sum;
        
        int resultado = numeros.stream()
                .reduce(somar)
                .orElse(0); // Valor padrão caso a lista esteja vazia
                
        System.out.println("A soma dos números é " + resultado);
    }
}
