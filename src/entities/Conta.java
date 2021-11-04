package entities;

public class Conta {

    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular, double valorDepositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(valorDepositoInicial);
    }

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor + 5;
    }

    public String toString() {
        return "Conta: "
                + numero
                + "\nTitular: "
                + titular
                + "\nSaldo R$: "
                + String.format("%.2f", saldo);

    }

}
