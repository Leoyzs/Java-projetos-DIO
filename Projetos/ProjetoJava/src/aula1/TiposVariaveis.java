package aula1;

public class TiposVariaveis {
	 public static void main (String [] args){
		 
		 byte Idade = 87;
		 short ano = 2024;
		 int cep = 83302250;
		 long cpf = 1287267190;
		 float pi = 3.14F;
		 double salario = 1225.75;
		 System.out.println(pi);
		 
		 short numeroCurto = 1;
		 int numeroNormal = numeroCurto;
		 short numeroCurto2 = (short) numeroNormal;
		 System.out.println(numeroCurto2);

		 final int numerofixo = 1;
		 System.out.println(numerofixo);

	 }
}
