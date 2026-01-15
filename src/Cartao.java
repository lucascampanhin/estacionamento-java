public class Cartao {

    private double saldoDebito;
    private double limiteCredito;

    public Cartao() {
        this.saldoDebito = 50.0;     // saldo fixo para débito
        this.limiteCredito = 100.0;  // limite fixo para crédito
    }

    public boolean pagarNoDebito(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (saldoDebito >= valor) {
            saldoDebito -= valor;
            return true;
        }

        return false;
    }

    public boolean pagarNoCredito(double valor) {
        if (valor <= 0) {
            return false;
        }

        if (limiteCredito >= valor) {
            limiteCredito -= valor;
            return true;
        }

        return false;
    }

    public double getSaldoDebito() {
        return saldoDebito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}
