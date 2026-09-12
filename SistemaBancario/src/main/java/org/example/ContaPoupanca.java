package org.example;

import javax.swing.JOptionPane;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca() {
        super();
        this.taxaRendimento = 0;
    }

    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // Metodo exclusivo para calcular e aplicar o rendimento
    public void aplicarRendimento() {
        if (getSaldo() <= 0) {
            JOptionPane.showMessageDialog(null, "Não há saldo na conta para aplicar rendimento.");
            return;
        }
        double rendimento = getSaldo() * (taxaRendimento / 100.0);
        setSaldo(getSaldo() + rendimento);
        JOptionPane.showMessageDialog(null, "Rendimento aplicado com sucesso!\n" +
                "Taxa: **" + taxaRendimento + "**%\n" +
                "Valor do rendimento: R$ " + rendimento + "\n" +
                "Novo saldo: R$ " + getSaldo());
    }
}