public class Estacionamento {

    private int vagasDisponiveis;

    public Estacionamento(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public boolean pagarNoDebito(Cartao cartao, Ticket ticket) {
        if (ticket.isPago()) {
            return false;
        }

        if (cartao.pagarNoDebito(ticket.getValor())) {
            vagasDisponiveis++;
            ticket.marcarComoPago();
            return true;
        }
        return false;
    }

    public boolean pagarNoCredito(Cartao cartao, Ticket ticket) {
        if (ticket.isPago()) {
            return false;
        }

        if (cartao.pagarNoCredito(ticket.getValor())) {
            vagasDisponiveis++;
            ticket.marcarComoPago();
            return true;
        }
        return false;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }
}
