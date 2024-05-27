package construtores;

public class main {
public static void main(String [] args){
    Construtores construtores = new Construtores("123", "Marcos");
    
    construtores.SetIdade("60");
    System.out.println(construtores.GetIdade() + construtores.GetNome() + construtores.GetCPF());
    
    
}
    
    
}
