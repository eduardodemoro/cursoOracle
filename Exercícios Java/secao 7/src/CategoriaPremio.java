public class CategoriaPremio {
    private String nome;
    private int ticketsObrigatorios;
    private int quantidadeDisponivel;

    public CategoriaPremio(String nome, int ticketsObrigatorios, int quantidadeDisponivel) {
        this.nome = nome;
        this.ticketsObrigatorios = ticketsObrigatorios;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public int getTicketsObrigatorios() {
        return ticketsObrigatorios;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void trocarPorPremio(Cartao cartao) {
        if (cartao.getSaldoTickets() >= ticketsObrigatorios && quantidadeDisponivel > 0) {
            cartao.setSaldoTickets(cartao.getSaldoTickets() - ticketsObrigatorios);

            quantidadeDisponivel--;

            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Parabéns! Você trocou " +
                    ticketsObrigatorios + " tickets por um prêmio da categoria " + nome +
                    ". Restam " + quantidadeDisponivel + " prêmios disponíveis.");
        } else if (quantidadeDisponivel == 0) {
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Não há mais prêmios disponíveis " +
                    "na categoria " + nome + ".");
        } else {
            System.out.println("Cartão " + cartao.getNumeroCartao() + ": Tickets insuficientes para " +
                    "trocar por um prêmio da categoria " + nome + ".");
        }
    }
}