package org.example;

import javax.swing.JOptionPane;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    // Construtor vazio
    public ContaBancaria() {
        this.saldo = 0;
    }

    // Construtor com parâmetros
    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0; // Saldo inicial igual a 0
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    // Metodo auxiliar protegido para permitir que as subclasses atualizem o saldo
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor de depósito inválido!");
        } else {
            this.saldo += valor;
            JOptionPane.showMessageDialog(null, "Depósito de R$ " + valor + " efetuado com sucesso!");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Valor de saque inválido!");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque de R$ " + valor + " efetuado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Saque não realizado! Saldo insuficiente.");
        }
    }
}