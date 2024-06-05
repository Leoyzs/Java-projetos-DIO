package ordenacaolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {
    
    private String nome;
    private int idade;
    private double altura;
    
    private List<Pessoa> pessoaList;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
  
        @Override
    public int compareTo(Pessoa p) {
       return Integer.compare(idade, p.getIdade());
    }   
    
    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    } 

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }
}


class comparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
       return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}


