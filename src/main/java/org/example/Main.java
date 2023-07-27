package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta_Bancaria contaBancaria1 = new Conta_Bancaria("Pedro Salvaro",100);
        System.out.println(contaBancaria1.getNome_completo());
        int escolha;
        do{
            escolha  = menuInicial();

            switch (escolha) {
                case 1 -> System.out.println(contaBancaria1.deposito());
                case 2 -> contaBancaria1.investimento();
                case 3 -> contaBancaria1.exibir_saldos();
                default -> System.out.println("bbb");
            }
            contaBancaria1.bonus();
        }while(escolha < 5);

    }
    public static int menuInicial(){
        Scanner input = new Scanner (System.in);
        System.out.println(" 1° Depositar");
        System.out.println("2 Investir ");
        System.out.println("3 Exibir Saldos");
        System.out.println(" 5 Sair");
        return input.nextInt();
    }
}