import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Validação {
    public static void main(String[] args) {

        String[] candidatos = {"Leonardo", "Adriano", "Tayssa", "Marcia", "Julia"};

        for(String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
        //seleçãoCandidatos();
        //imprimirSelecionados();
    
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
                if(continuarTentando){
                    tentativasRealizadas++;

                }
                else{
                System.out.println("Contato Realizado");
            }

        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " Tentativa");
        }
        else{
            System.out.println("Não conseguimos contato com " + candidato + " nas " + tentativasRealizadas + " Tentativas");
        }
    }

    //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }




















    // Método que simula valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
        
    }

    static void seleçãoCandidatos(){
        String[] candidatos = {"Leonardo", "Adriano", "Tayssa", "Marcia", "Julia", "Eleando", "Leticia", "Marcos", "Steve", "Rycardo"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double SalarioBase = 2000.00;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("o candidato " +  candidato + " Solicitou " + salarioPretendido);
            if(SalarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga" );
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"Leonardo", "Adriano", "Tayssa", "Marcia", "Julia"};
            System.out.println("Forma abreviada de interação For each");
            for(String candidato: candidatos){
                System.out.println("O candidato selecionado foi: " + candidato);
            }

        }


    }


            
