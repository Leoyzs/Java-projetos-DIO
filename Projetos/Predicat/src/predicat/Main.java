package predicat;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Cenoura", "Sla", "TayssaTeAmo");
        
        java.util.function.Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
    
}
