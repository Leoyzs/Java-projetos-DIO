package conjuntosconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosConvidados {

    private Set<Convidado> convidadoSet;
    
    public ConjuntosConvidados(){
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidado(int codigoConvite){
     Convidado convidadoParaRemover = null;
     for(Convidado c : convidadoSet){
         if(c.getCodigoConvite() == codigoConvite){
             convidadoParaRemover = c;
             break;
         }
     }
    convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    
    public void exibirConvidados(){
        System.out.print(convidadoSet);
    }
    
    public static void main (String [] args){
        ConjuntosConvidados Cc = new ConjuntosConvidados();
        
        Cc.adicionarConvidado("Rodrigo", 98946);
        Cc.adicionarConvidado("Roberto", 876);
        Cc.adicionarConvidado("Carlos", 4894);
        Cc.adicionarConvidado("Kime", 45343);
        Cc.adicionarConvidado("Origomi", 7554);
        System.out.println("Depois de adicionados iremos contar quantos convidados temos \n");
        System.out.println(Cc.contarConvidados());
        System.out.println("Agora iremos mostrar nossos convidados \n");
        Cc.exibirConvidados();
        System.out.println("\nRemovendo um convidado e mostrando os que sobrou\n");
        Cc.removerConvidado(7554);
        System.out.println(Cc.contarConvidados() + "\n");
        Cc.exibirConvidados();
    }
}
