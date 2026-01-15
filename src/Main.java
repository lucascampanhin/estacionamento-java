import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento(10);
        Cartao cartao = new Cartao();
        Ticket ticket = new Ticket();

        System.out.println("Bem-vindo ao estacionamento");
        System.out.println("Tempo gerado automaticamente: " + ticket.getHoras() + " hora(s)");
        System.out.println("Valor a pagar: R$ " + ticket.getValor());

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");

        int opcao = sc.nextInt();
        boolean liberado = false;

        if (opcao == 1) {
            liberado = estacionamento.pagarNoDebito(cartao, ticket);
        } else if (opcao == 2) {
            liberado = estacionamento.pagarNoCredito(cartao, ticket);
        }

        if (liberado) {
            System.out.println("Pagamento aprovado. Saída liberada.");
            ticket.imprimirComprovante();
        } else {
            System.out.println("Saldo insuficiente. Pagamento recusado.");
        }

        sc.close();
    }
}
