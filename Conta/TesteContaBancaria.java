package Conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contabancaria1 = new ContaBancaria();
        contabancaria1.setNumero("123");
        contabancaria1.setTitular("Mic");

        contabancaria1.depositar(510);
        contabancaria1.sacar(100);
    }
}
