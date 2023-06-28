public class Terminal {
    private static final int RATIO_DOLAR_CREDITO = 2;

    public void carregarCredito(Cartao cartao, int valorDolar) {
        int creditos = valorDolar * RATIO_DOLAR_CREDITO;

        cartao.setSaldoCredito(cartao.getSaldoCredito() + creditos);
        
        System.out.println("Cartão " + cartao.getNumeroCartao() + ": Créditos carregados. Novo saldo: " +
                cartao.getSaldoCredito());
    }

    public void transferirSaldo(Cartao cartaoOrigem, Cartao cartaoDestino) {
        int saldoCreditoOrigem = cartaoOrigem.getSaldoCredito();
        int saldoTicketsOrigem = cartaoOrigem.getSaldoTickets();

        cartaoOrigem.setSaldoCredito(0);
        cartaoOrigem.setSaldoTickets(0);

        cartaoDestino.setSaldoCredito(cartaoDestino.getSaldoCredito() + saldoCreditoOrigem);
        cartaoDestino.setSaldoTickets(cartaoDestino.getSaldoTickets() + saldoTicketsOrigem);

        System.out.println("Saldo e tíquetes transferidos do Cartão " + cartaoOrigem.getNumeroCartao() +
                " para o Cartão " + cartaoDestino.getNumeroCartao() + ".");
    }

    public void solicitarPremio(Cartao cartao, CategoriaPremio categoriaPremio) {
        categoriaPremio.trocarPorPremio(cartao);
    }
}