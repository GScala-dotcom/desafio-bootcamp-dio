import br.com.desafio.dio.Credito;
import br.com.desafio.dio.Poupanca;

public class Main {

    public static void main (String [] args) {

        Credito credito = new Credito();
        credito.setNome("Cartao de Credito Free");
        credito.setLimite(0);

        Poupanca poupanca = new Poupanca();
        poupanca.setNome("Conta poupanca Facil");
        poupanca.setSaldo(0);



    }
}
