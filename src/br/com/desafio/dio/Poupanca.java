package br.com.desafio.dio;

public class Poupanca extends Conta{

    private int saldo;

    public Poupanca() {
    }

    public double inserirValor() {
        return valorInicial + getValor();
    }

    @Override
    public double reduzirValor() {
        return valorInicial - getValor();
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Poupanca{" +
                "nome='" + getNome() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }

}
