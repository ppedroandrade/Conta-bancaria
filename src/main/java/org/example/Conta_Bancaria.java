package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Conta_Bancaria {
    private String nome_completo;
    private double saldo;

    private double saldo_investido;

    public Conta_Bancaria(String nome_completo, double saldo) {
        this.nome_completo = nome_completo;
        this.saldo = saldo;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Long saldo_inicial) {
        this.saldo = saldo_inicial;
    }
    public void sacar(){}
    public void deposito(){}   //PERGUNTAR O VALOR DE INPUT AQUI DENTRO DA CONTA
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
    public void dados_da_conta(){}
    public void bonus(){
        saldo_investido = saldo_investido * 1.05;
    }
    public void exibir_saldos(){
        System.out.println("Seu saldo é :"+ saldo);
        System.out.println("Seu saldo investido é :"+ saldo_investido);
    }
}

