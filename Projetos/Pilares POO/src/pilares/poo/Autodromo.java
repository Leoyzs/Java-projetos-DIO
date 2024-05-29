package pilares.poo;

public class Autodromo {
    public static void main (String [] args){
        
        Veiculo veiculoEscolhido = null;
        
        
        String VeiculoEscolher = "Carro";
        
        
        if(VeiculoEscolher.equals("Carro")){
            veiculoEscolhido = new Carro();
            veiculoEscolhido.Ligar();
        } 
        else if(VeiculoEscolher.equals("Moto")){
        veiculoEscolhido = new Moto();
        veiculoEscolhido.Ligar();
    }
        



        
    }
    
}
