public class Ticket {

    private int horas;
    private double valor;
    private boolean pago;

    public Ticket() {
        gerarTempoAleatorio();
        calcularValor();
        this.pago = false;
    }

    private void gerarTempoAleatorio() {
        this.horas = (int) (Math.random() * 5) + 1;
    }

    private void calcularValor() {
        this.valor = horas * 15;

        if (valor < 15) {
            valor = 15;
        }
    }

    public double getValor() {
        return valor;
    }

    public int getHoras() {
        return horas;
    }

    public boolean isPago() {
        return pago;
    }

    public void marcarComoPago() {
        this.pago = true;
    }

    public void imprimirComprovante() {
        System.out.println("----- COMPROVANTE -----");
        System.out.println("Tempo estacionado: " + horas + " hora(s)");
        System.out.println("Valor pago: R$ " + valor);
        System.out.println("-----------------------");
    }
}
