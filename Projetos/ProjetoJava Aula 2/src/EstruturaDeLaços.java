import java.lang.classfile.instruction.SwitchCase;

public class EstruturaDeLaços {
    public static void main (String [] args){
/* 
        int nota = 4;
        String resultado = (nota >= 7) ? "Aprovado" : (nota >=5 && nota < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);  */

        int Numero = 5;
        switch (Numero){

            case 1:{
                System.out.println("Você deseja o plano BASIC");
            break;    
            }

            case 2: {
                System.out.println("Você deseja o plano MIDIA");
            break;
            }

            case 3: {
                System.out.println("Você deseja o plano TURBO ");
            break;
            }

            default: {
                System.out.println("Nenhum numero digitado invalido");
            break;
            }

        }



    }
}