package pesquisaset.OrdenaçãoSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Produto implements Comparable<Produto> {
    
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.codigo == other.codigo;
    }
    
    private Set<Produto> produtoSet;
    
    public Set<Produto> exibirProdutoPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(Comparator.comparing(Produto::getNome));
    produtosPorNome.addAll(produtoSet);
    return produtosPorNome;
}
    
@Override
public int compareTo(Produto p) {
        return this.nome.compareToIgnoreCase(p.getNome());
    }
}
    
    class ComparatorPorPreco implements Comparator<Produto>{

        @Override
        public int compare(Produto p1, Produto p2) {
          return Double.compare(p1.getPreco(), p2.getPreco());
        }
        
    }
   

