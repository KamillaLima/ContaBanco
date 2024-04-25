import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String nomeCliente = "", agencia = "";
        double saldo;
        int numeroAgencia;
        System.out.println("----BANCO----");

        do {
            System.out.print("INFORME O NÚMERO DA AGÊNCIA: ");
            numeroAgencia = sn.nextInt();
        }while(numeroAgencia < 1000);

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

            do {
                System.out.print("INFORME O SEU SALDO: R$");
                 saldo = sn.nextDouble();
            }
            while(saldo <= 0);
            String mensagem = "Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +
                    ", conta " + agencia + ", e seu saldo já está disponível para saque: R$" + saldo;

            System.out.println(mensagem);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um valor válido");
        }
    }
}
