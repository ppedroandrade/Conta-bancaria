package org.example;

public class Conta_Bancaria {
    private String nome_completo;
    private Long saldo_inicial;

    public Conta_Bancaria(String nome_completo, Long saldo_inicial) {
        this.nome_completo = nome_completo;
        this.saldo_inicial = saldo_inicial;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public Long getSaldo_inicial() {
        return saldo_inicial;
    }

    public void setSaldo_inicial(Long saldo_inicial) {
        this.saldo_inicial = saldo_inicial;
    }
    public String resgate(){return"Voce resgout ..."; }
    public String deposito(){return"Voce resgout ..."; }
    public String investimento(){return"Voce resgout ..."; }
    public String dados_da_conta(){return"Voce resgout ..."; }
    public String bonus(){return"Voce resgout ..."; }

}

