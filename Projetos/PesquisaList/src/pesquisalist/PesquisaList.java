package pesquisalist;

public class PesquisaList {

    public static void main(String[] args) {
        
        CatalogoLivros Cl = new CatalogoLivros();
        Cl.adicionarLivro("Tesouro", "Leonardo", 2030);
        Cl.adicionarLivro("Tesouro", "Tata", 2020);
        Cl.adicionarLivro("Chaves", "Tata", 2020);
        Cl.adicionarLivro("O troco", "Leonardo", 2023);
        Cl.adicionarLivro("Vinganca de adis", "Lu", 2024);
        
        // pesquisando por autor 
        System.out.println(Cl.pesquisarPorAutor("Leonardo"));
        System.out.println(Cl.pesquisarPorAutor("Tata"));
        System.out.println(Cl.pesquisarPorAutor("Lu"));
        
        
        //intervalo
        System.out.println(Cl.pesquisarPorIntervaloDeAnos(2020,2022));
        
        // titulo
        System.out.println(Cl.pesquisarPorTitulo("Tesouro"));
       
        
    }
    
}
