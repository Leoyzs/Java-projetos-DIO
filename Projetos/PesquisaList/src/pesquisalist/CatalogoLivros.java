package pesquisalist;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    } 
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        
        for(Livro l : livroList){
            if(l.getAutor().equals(autor)){
                livrosPorAutor.add(l);
            }
        }
        
        return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        
        for(Livro l : livroList){
            if(l.getAnoPublicação()>= anoInicial && l.getAnoPublicação()<= anoFinal){
                livrosPorIntervaloDeAnos.add(l);
            }
        }
        
        return livrosPorIntervaloDeAnos;
    } 
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        
        for(Livro l : livroList){
            if(l.getTitulo().equals(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
        
        return livroPorTitulo;
    }
}
