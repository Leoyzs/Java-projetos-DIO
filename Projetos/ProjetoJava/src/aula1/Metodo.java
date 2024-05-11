package aula1;

public class Metodo {
	 public static void main (String [] args){
		 
		 SmarTv smartTv = new SmarTv();
		 
		System.out.println("Sua tv está " + smartTv.Ligada);
		System.out.println("Seu volume é " + smartTv.Volume);
		System.out.println("Canal atual: " + smartTv.Canal);
		
		
		smartTv.Desligar();
		
		System.out.println("Novo status -> sua tv está " + smartTv.Ligada);
			
		smartTv.AumentarVolume();
		System.out.println("Seu volume é " + smartTv.Volume);		
		
		smartTv.PassarParaProximoCanal();
		System.out.println("Seu Canal é " + smartTv.Canal);		
	}
}
