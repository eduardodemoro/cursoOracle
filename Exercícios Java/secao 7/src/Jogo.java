import java.util.Random;

public class Jogo {
    private int creditosNecessarios;

    public Jogo(int creditosNecessarios) {
        this.creditosNecessarios = creditosNecessarios;
    }

    public int getCreditosNecessarios() {
        return creditosNecessarios;
    }

    public void jogar(Cartao cartao) {
        if (cartao.getSaldoCredito() >= creditosNecessarios) {
            cartao.setSaldoCredito(cartao.getSaldoCredito() - creditosNecessarios);

            int ticketsGanhos = new Random().nextInt() + 1;

            if (ticketsGanhos < 0) {
                ticketsGanhos *= -1;
            }

            cartao.setSaldoTickets(cartao.getSaldoTickets() + ticketsGanhos);

            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Você ganhou " +
                    ticketsGanhos + " tickets. Novo saldo: " + cartao.getSaldoTickets());
        } else {
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Créditos insuficientes para jogar.");
        }
    }
}
