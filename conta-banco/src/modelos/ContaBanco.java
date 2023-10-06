package modelos;

public class ContaBanco {
    private String agencia;
    private int numero;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(String agencia, int numero, String nomeCliente, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "\nOlá " + getNomeCliente()
                + ", obrigado por criar uma conta em nosso banco.\n\n"
                + "Sua agência é " + getAgencia()
                + ", conta " + getNumero()
                + " e seu saldo R$ " + getSaldo()
                + " já está disponível para saque.";
    }
}
