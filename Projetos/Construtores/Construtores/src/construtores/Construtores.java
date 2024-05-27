package construtores;

public class Construtores {

        private String nome;
        private String idade;
        private String CPF;
        
        public Construtores (String CPF, String nome){
            this.CPF = CPF;
            this.nome = nome;        
        }   
        
        public String GetNome(){
            return nome;
        }
        
        /*
        public void SetNome(String newNome){
            this.nome = newNome;
        }
        */
  
        public String GetIdade(){
        return idade;
        }
        
        public void SetIdade(String newIdade){
            this.idade = newIdade;
        }   
        
        public String GetCPF(){
        return CPF;
        }
    
}
