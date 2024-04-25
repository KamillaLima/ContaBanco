import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String nomeCliente = "", agencia = "";

        System.out.println("----BANCO----");
        System.out.print("INFORME O NÚMERO DA AGÊNCIA: ");
        int numeroAgencia = sn.nextInt();
        sn.nextLine(); // Consumir a quebra de linha pendente

        try {
            do {
                System.out.print("INFORME A AGÊNCIA: ");
                agencia = sn.nextLine();
            } while (agencia.equals(""));

            do {
                System.out.print("INFORME O NOME DO CLIENTE: ");
                nomeCliente = sn.nextLine();
            } while (nomeCliente.equals(""));

            System.out.print("INFORME O SEU SALDO: R$");
            double saldo = sn.nextDouble();

            String mensagem = "Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                    ", conta " + agencia + ", e seu saldo já está disponível para saque: R$" + saldo;

            System.out.println(mensagem);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um valor válido");
        }
    }
}
