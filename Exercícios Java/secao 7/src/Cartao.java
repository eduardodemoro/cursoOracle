public class Cartao {
    private int numeroCartao;
    private int saldoCredito;
    private int saldoTickets;

    public Cartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
        this.saldoCredito = 0;
        this.saldoTickets = 0;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public int getSaldoCredito() {
        return saldoCredito;
    }

    public void setSaldoCredito(int saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    public int getSaldoTickets() {
        return saldoTickets;
    }

    public void setSaldoTickets(int saldoTickets) {
        this.saldoTickets = saldoTickets;
    }
}
