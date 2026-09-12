package org.example;

import javax.swing.JOptionPane;

public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente() {
        super();
        this.limite = 0;
    }

    public ContaCorrente(int numero, String titular, double limite) {
        super(numero, titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Sobrescrita do metodo sacar permitindo o uso do limite (Saldo + Limite)
    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor de saque inválido!");
        } else if (valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Saque de R$ " + valor + " efetuado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Saque não realizado! Valor superior ao saldo disponível + limite.");
        }
    }
}