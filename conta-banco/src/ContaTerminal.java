import modelos.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = input.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = input.nextInt();
        input.nextLine(); // limpa o buffer do scanner

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = input.nextDouble();

        input.close();

        ContaBanco novaConta = new ContaBanco(numeroAgencia, numeroConta, nomeCliente, saldo);
        System.out.println(novaConta);
    }
}
