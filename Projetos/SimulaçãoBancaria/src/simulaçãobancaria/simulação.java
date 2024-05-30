package simulaçãobancaria;

import java.util.Scanner;


public class simulação {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
            System.out.println("Escolha as opcoes de sua conta bancaria sendo \n 1 para Deposito\n 2 para sacar\n 3 para conferir saldo \n e 0 para finalizar programa");

        while (continuar) {
         int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Seu novo saldo atual: " + String.format("%.1f", saldo));
                    System.out.println("Escolha as opcoes de sua conta bancaria sendo \n 1 para Deposito\n 2 para sacar\n 3 para conferir saldo \n e 0 para finalizar programa");

                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado");
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado < saldo) {
                        saldo -= valorSacado;
                        System.out.println("Seu novo saldo atual: " + String.format("%.1f", saldo));
                        System.out.println("Escolha as opcoes de sua conta bancaria sendo \n 1 para Deposito\n 2 para sacar\n 3 para conferir saldo \n e 0 para finalizar programa");

                    } else {
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Escolha as opcoes de sua conta bancaria sendo \n 1 para Deposito\n 2 para sacar\n 3 para conferir saldo \n e 0 para finalizar programa");

                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    System.out.println("Escolha as opcoes de sua conta bancaria sendo \n 1 para Deposito\n 2 para sacar\n 3 para conferir saldo \n e 0 para finalizar programa");

                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opcao inválida. Tente novamente.");
                    System.out.println("Escolha as opcoes de sua conta bancaria sendo \n 1 para Deposito\n 2 para sacar\n 3 para conferir saldo \n e 0 para finalizar programa");

            }
        }
        scanner.close();
    }
}

    
    
    
    

