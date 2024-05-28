package pilares.poo;

public class Carro extends Veiculo{
    
    @Override
    public void Ligar(){
        System.out.println("Carro ligado");
        ConfereCombustivel();
        ConfereCambio();
    }
         private void ConfereCombustivel(){
     System.out.println("Conferindo combustivel");
    }
     private void ConfereCambio(){
     System.out.println("Conferindo cambio");
    }  
}
