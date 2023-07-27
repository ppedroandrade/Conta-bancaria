package org.example;
import java.util.Scanner;

public class Conta_Bancaria {

    //Crição dos metodos

    private String nome_completo;
    private double saldo;

    private double saldo_investido;

    //Logica/funções do banco, exibição de conta bancaria, saque, deposito, investimento, dados da conta, o bonus e exibição saldos

    public Conta_Bancaria(String nome_completo, double saldo) {
        this.nome_completo = nome_completo;
        this.saldo = saldo;
    }
    public void sacar(){
        System.out.println("Digite o valor que deseja sacar : ");
        Scanner input = new Scanner (System.in);
        double saque = input.nextDouble();
        if(saque <= saldo){
            saldo -= saque;
            System.out.println("Seu saldo é :"+ saldo);
        }else{
            System.out.println("Voce nao tem saldo pra sacar");
        }
    }
    public void deposito(){
        System.out.println("Digite o valor que deseja depositar : ");
        Scanner input = new Scanner (System.in);
        double deposito = input.nextDouble();
            saldo += deposito;
            System.out.println("Seu saldo é :"+ saldo);

    }
    public void investimento(){
        System.out.println("Digite o valor a investir: ");
        Scanner input = new Scanner (System.in);
        double valor = input.nextDouble();
        if(valor <= saldo){
            saldo -= valor;
            saldo_investido += valor;
            System.out.println("Seu saldo é :"+ saldo);
            System.out.println("Seu saldo investido é :"+ saldo_investido);
        }else{
            System.out.println("Voce nao tem saldo pra investir");
        }
        }

    public void sacar_do_investimento(){
        System.out.println("Digite o valor a retirar do investimento: ");
        Scanner input = new Scanner (System.in);
        double valorDoSaque = input.nextDouble();
        if(valorDoSaque <= saldo_investido){
            saldo_investido -= valorDoSaque;
            saldo += valorDoSaque;
            System.out.println("Seu saldo é :"+ saldo);
            System.out.println("Seu saldo investido é :"+ saldo_investido);
        }else{
            System.out.println("Voce nao tem saldo pra sacar do investimento");
        }
    }
    public void dados_da_conta(){
        System.out.println("Seja bem vindo "+ nome_completo);
        System.out.println("Seu saldo é :"+ saldo);
    }
    public void bonus(){
        saldo_investido = saldo_investido * 1.05;
    }
    public void exibir_saldos(){
        System.out.println("Seu saldo é :"+ saldo);
        System.out.println("Seu saldo investido é :"+ saldo_investido);
    }
}

