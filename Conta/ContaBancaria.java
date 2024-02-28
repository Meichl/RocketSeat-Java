package Conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;


    public ContaBancaria(){
        saldo = 0.0;
    }

    public void setNumero(String numero) {
        this.numero = numero;

    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }


    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + "Saldo atual R$ " + saldo);

        } else {
            System.out.println("Valor invalido");
        }
    }

    void sacar (double valor){
        if (valor > 0 && valor <= saldo){
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + "Saldo atual R$ " + saldo);
        }
    }
}
