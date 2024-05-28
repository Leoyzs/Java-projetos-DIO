package pilares.poo;

public class Autodromo {
    public static void main (String [] args){
        
        Carro carro = new Carro();
        carro.setChassi("4565-ANB");
        carro.Ligar();

        Moto Cg160 = new Moto();
        Cg160.setChassi("9284-BCF");
        Cg160.Ligar();
        
    }
    
}
