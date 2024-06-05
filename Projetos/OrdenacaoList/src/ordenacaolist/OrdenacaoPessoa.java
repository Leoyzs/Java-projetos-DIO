package ordenacaolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new comparatorPorAltura());
        return pessoaPorAltura;
    }
    
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    } 

    public static void main(String [] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoa("Rodrigo", 17, 1.55);
        op.adicionarPessoa("Roberto", 30, 1.78);
        op.adicionarPessoa("Leticia", 15, 1.66);
        op.adicionarPessoa("Roberto", 22, 1.98);
        
        System.out.println("Ordenado por altura:");
        System.out.println(op.ordenarPorAltura());
        
        System.out.println("Ordenado por idade:");
        System.out.println(op.ordenarPorIdade());
        
        System.out.println("Lista de pessoas:");
        System.out.println(op.pessoaList);
    }
}

