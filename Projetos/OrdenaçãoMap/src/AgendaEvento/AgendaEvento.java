package AgendaEvento;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEvento() {
        this.eventosMap = new TreeMap<>();
    }
    
    public void adicionarEvento(LocalDate data, String nome, String atracao ){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }
    
    public void exibirEventos(){
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    
    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }
    
    public static void main (String [] args){
        AgendaEvento ae = new AgendaEvento();
        ae.adicionarEvento(LocalDate.of(2024, Month.MARCH, 15), "Réveillon", "Luan Santana");
        ae.adicionarEvento(LocalDate.of(2024, Month.MARCH, 30), "Festa de crianças", "Crianças");
        ae.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 14), "Dia das crianças", "Cama elástica");
        ae.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 19), "Rave", "Dj Alok");
        ae.adicionarEvento(LocalDate.of(2024, Month.APRIL, 15), "Ano novo", "Fogos de artifício");
        ae.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 18), "Páscoa", "Ovos de chocolate");
        ae.adicionarEvento(LocalDate.of(2024, Month.JULY, 05), "Tradição", "Comemoração em família");
        ae.adicionarEvento(LocalDate.of(2024, Month.MARCH, 20), "Festa junina", "Fogueira e danças");
        
        ae.exibirEventos();
        
        ae.obterProximoEvento();
    }   
}
