import exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int parametroUm = input.nextInt();
            System.out.print("Digite o segundo número inteiro: ");
            int parametroDois = input.nextInt();

            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Os parâmetros devem ser números inteiros");
        } finally {
            input.close();
        }
    }

    /**
     * A função deve imprimir a mensagem com os números informados, incluindo o número final e,
     * a quantidade de números impressos.
     *
     * @param parametroUm
     * @param parametroDois
     * @throws ParametrosInvalidosException
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + (parametroUm + i));
        }
        System.out.println("Foram impressos " + (contagem + 1) + " números.");
    }
}
