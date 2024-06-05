package pesquisalist;

public class Livro {
    private String Titulo, Autor;
    private int AnoPublicação;

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPublicação() {
        return AnoPublicação;
    }
    
    
    public Livro(String Titulo, String Autor, int AnoPublicação) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnoPublicação = AnoPublicação;
    }

    @Override
    public String toString() {
        return "Livro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", AnoPublica\u00e7\u00e3o=" + AnoPublicação + '}';
    }
    
    
    
    
}
