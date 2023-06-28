public class Fliperama {
    public static void main(String[] args) throws Exception {
        Cartao cartao1 = new Cartao(1);
        Cartao cartao2 = new Cartao(2);
        Jogo jogo1 = new Jogo(2);
        Jogo jogo2 = new Jogo(3); 
        CategoriaPremio premio1 = new CategoriaPremio("Prêmio 1", 10, 3); 
        CategoriaPremio premio2 = new CategoriaPremio("Prêmio 2", 5, 2); 
        Terminal terminal = new Terminal();

        terminal.carregarCredito(cartao1, 10);
        terminal.carregarCredito(cartao2, 5);

        jogo1.jogar(cartao1);
        jogo1.jogar(cartao2);
        jogo2.jogar(cartao2);

        terminal.transferirSaldo(cartao1, cartao2);

        terminal.solicitarPremio(cartao2, premio1);
        terminal.solicitarPremio(cartao2, premio1);
        terminal.solicitarPremio(cartao2, premio2);
        terminal.solicitarPremio(cartao2, premio2);
        terminal.solicitarPremio(cartao2, premio1);

        jogo1.jogar(cartao1);
        terminal.solicitarPremio(cartao1, premio1);
    }
}