package Aula16ExcecoesClientes.src;

import Aula16ExcecoesClientes.src.ClientesException;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        saldoEmConta= 0;

    }
    // throws prepara o java para possível exceção
    public void comprar(double valor) throws ClientesException {
        if(valor > (saldoEmConta + limite))
            // throw - lança a exceção
            throw new ClientesException("Saldo insuficiente!!");
        else
            saldoEmConta-=valor;
    }
    public void pagarDivida(double valor) throws ClientesException {
        if(saldoEmConta > 0)
            throw new ClientesException("Você não tem dívida");
        else
            saldoEmConta+=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}