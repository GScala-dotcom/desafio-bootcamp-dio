package br.com.desafio.dio;

public class Credito extends Conta {

    private int limite;

    public Credito() {
    }

    @Override
    public double reduzirValor() {
        return limite - getValor();
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Credito{" +
                "nome='" + getNome() + '\'' +
                ", limite=" + limite +
                '}';
    }

}
