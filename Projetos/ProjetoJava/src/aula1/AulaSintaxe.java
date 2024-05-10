package aula1;


public class  AulaSintaxe {
    public static void main (String [] args){
    	
		String primeiroNome = "Brasil";
		String segundoNome = "2024";

		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
				System.out.println(nomeCompleto);
    } 
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
    	return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}