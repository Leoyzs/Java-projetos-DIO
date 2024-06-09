package pesquisaset.OrdenaçãoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProdutos {
  
    private Set<Produto> produtoSet;
    
    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }
    
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    
    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    
       public static void main (String [] args){
        
         CadastroProdutos cp = new CadastroProdutos();
         cp.adicionarProduto(48948, "DVD", 8.75, 50000);
         cp.adicionarProduto(4561, "Fones", 85.00, 200);
         cp.adicionarProduto(8792, "Computador", 8500.75, 50);
         
         System.out.println(cp.produtoSet + "\n\n");
     
         System.out.println(cp.exibirProdutosPorNome());
         
         System.out.println(cp.exibirProdutoPorPreco());
     
     }  
    
    
}
