package agendacontato;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = agendaContatoMap;
    }
    
    public void adicionarContato(String nome, int telefone){
        agendaContatoMap.put(nome, telefone);
    }        
 
    public void removerContato(String nome){       
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }       
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }     
    
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    
    public static void main (String [] args){
        Map<String, Integer> mapaInicial = new HashMap<>();
        AgendaContato Ac = new AgendaContato(mapaInicial);
        Ac.adicionarContato("Leonardo", 895);
        Ac.adicionarContato("roberto", 45613);
        Ac.adicionarContato("Carlos", 98445);
        Ac.adicionarContato("Leonardo Silva", 8955);
        System.out.println("\n\n");
        
        Ac.exibirContato();
        
        System.out.println("\n\n");
        
        Ac.removerContato("Carlos");
        
        System.out.println("\n\n");
        
        Ac.exibirContato();
        
        System.out.println("\n\n");
        
        System.out.println(Ac.pesquisarPorNome("Leonardo"));
    }   
}
