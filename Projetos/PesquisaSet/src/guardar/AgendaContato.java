package guardar;

import java.util.Objects;
import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    

    private Set<Contato> contatoSet;
    
   public AgendaContato(){
       this.contatoSet = new HashSet<>();
       
   }
    public void AdicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
   
   public void exibirContato(){
       System.out.println(contatoSet);
   }
   
   public Set<Contato> pesquisarPorNome(String nome){
       Set<Contato> contatosPorNome = new HashSet<>();
       for(Contato c : contatoSet){
           if(c.getNome().startsWith(nome)){
               contatosPorNome.add(c);
           }
           
       }
       return contatosPorNome;
   }
   
   public Contato atualizarPorContato(String nome, int novoNumero){
       Contato contatoAtualizado = null;
       for(Contato c : contatoSet){
           if(c.getNome().equalsIgnoreCase(nome)){
               c.setNumero(novoNumero);
               contatoAtualizado = c;
               break;
           }
       }
       return contatoAtualizado;
   }
   /*
   public static void main (String [] args){
       AgendaContato Ac = new AgendaContato();
       Ac.AdicionarContato("Allanis ", 84956263);
       Ac.AdicionarContato("roberta", 5864554);
       Ac.AdicionarContato("Allanis Aparecida", 41845662);
       Ac.AdicionarContato("Tay", 537773);
       Ac.AdicionarContato("Allanis m", 14655778);
       Ac.AdicionarContato("Elessandro", 84956263);
       
       System.out.println("\n Iremos exibis todos nossos contatos atuais \n");
       Ac.exibirContato();
       
       System.out.println("\nAgora iremos pesquisar por nome Allanis\n");
       System.out.println( Ac.pesquisarPorNome("Allanis"));
      
       System.out.println("\nAgora iremos atualizar o contato da allanis e exibir novamente os contatos allanis\n");
       Ac.atualizarPorContato("Allanis ", 748451);
       System.out.println( Ac.pesquisarPorNome("Allanis"));
   }*/
   
}
