package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta_Bancaria contaBancaria1 = new Conta_Bancaria("Pedro Salvaro",100);
        int escolha;
        do{
            escolha  = menuInicial();

            switch (escolha) {
                case 1 -> contaBancaria1.deposito();
                case 2 -> contaBancaria1.investimento();
                case 3 -> contaBancaria1.exibir_saldos();
                case 5 ->  System.out.println("Obrigado por usar o NuBank. Até a próxima!");
                default -> System.out.println("Opção inválida. Escolha novamente.");
            }
            contaBancaria1.bonus();
        }while(escolha < 5);

    }
    public static int menuInicial(){
        Scanner input = new Scanner (System.in);
        System.out.println(" Bem vindo a NuBank");

        System.out.println("1 Depositar");
        System.out.println("2 Investir ");
        System.out.println("3 Exibir Saldos");
        System.out.println("5 Sair");
        return input.nextInt();
    }

}