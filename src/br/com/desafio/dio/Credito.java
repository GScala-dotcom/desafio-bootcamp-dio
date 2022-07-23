package br.com.desafio.dio;

public class Credito extends Conta {

    private int limite;

    public int getLimite() {
        return limite;
    }

    public void setLimiteMaximo(int limite) {
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
