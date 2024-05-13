package aula1;

public class SmarTv {
	
	boolean Ligada = true;
	int Volume = 1;
	int Canal = 2;
	
	public void Desligar() {
		System.out.println("Desligando a Tv");
		Ligada = false;
	}
	
	public void Ligar() {
		System.out.println("Ligando a Tv");
		Ligada = true;
	}
	
	
	public void AumentarVolume() {
		System.out.println("Aumentando o volume");
		++ Volume;
	}
	
	public void PassarParaProximoCanal() {
		System.out.println("Passando proximo canal");
		++ Canal;
	}
	
}
