package pesquisamap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        // Verifica se o produto já existe no estoque e substitui se necessário
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    
    public double calcularValorTotalDoEstoque(){
        double valorTotalEstoque = 0d;
        for(Produto p : estoqueProdutosMap.values()){
            valorTotalEstoque += p.getQuantidade() * p.getPreco();
        }
        System.out.println("O valor total do estoque é " + valorTotalEstoque);
        return valorTotalEstoque;
    }
    
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        System.out.println("O valor do produto mais caro: " + maiorPreco);
        return produtoMaisCaro;
    }
    
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto p : estoqueProdutosMap.values()){
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        System.out.println("O valor do produto mais barato: " + menorPreco);
        return produtoMaisBarato;
    }
    
    public static void main(String[] args) {
        EstoqueProdutos ep = new EstoqueProdutos();
        
        // Adicionar alguns produtos para teste
        ep.adicionarProduto(1, "Camiseta", 10, 29.99);
        ep.adicionarProduto(2, "Calça", 5, 59.99);
        
        ep.exibirProdutos();
        ep.calcularValorTotalDoEstoque();
        ep.obterProdutoMaisCaro();
        ep.obterProdutoMaisBarato();
    }
}
