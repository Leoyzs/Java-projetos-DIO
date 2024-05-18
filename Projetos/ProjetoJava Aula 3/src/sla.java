import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class sla {

public static void main(String []args){

  //  AULA DE COMO REALIZAR EXCESSOES
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    try{
    System.out.println("Digite seu nome");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome");
    String sobrenome = scanner.next();

    System.out.println("Digite sua idade");
    int idade = scanner.nextInt();

    System.out.println("Seu nome completo é " +nome + " " + sobrenome + " e possui " + idade + " anos");
    } catch(InputMismatchException e){
        System.out.println("error 4004z");
    }


}

    
}