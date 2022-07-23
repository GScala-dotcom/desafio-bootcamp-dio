package br.com.desafio.dio;

public abstract class Conta {

    private String nome;
    private double valor;

    protected static final double valorInicial= 0d;

    public Conta() {
    }

    public abstract double reduzirValor();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

}
