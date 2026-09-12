package org.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        int opcao = -1;

        do {
            String inputOpcao = JOptionPane.showInputDialog(null,
                    "=== SISTEMA BANCÁRIO ===\n" +
                            "1. Conta Corrente\n" +
                            "2. Conta Poupança\n" +
                            "0. Sair\n\n" +
                            "Digite a opção desejada:");

            if (inputOpcao == null) break;

            try {
                opcao = Integer.parseInt(inputOpcao);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número válido.");
                continue;
            }

            switch (opcao) {
                case 1:
                    gerenciarContaCorrente();
                    break;
                case 2:
                    gerenciarContaPoupanca();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Até logo!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    private static void gerenciarContaCorrente() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da Conta Corrente:"));
        String titular = JOptionPane.showInputDialog("Informe o nome do titular:");
        double limite = Double.parseDouble(JOptionPane.showInputDialog("Informe o limite da conta (R$):"));

        ContaCorrente cc = new ContaCorrente(numero, titular, limite);
        int opcaoSubmenu = -1;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "=== CONTA CORRENTE ===\n" +
                            "Titular: " + cc.getTitular() + " | Nº: " + cc.getNumero() + "\n\n" +
                            "1. Consultar saldo\n" +
                            "2. Depositar\n" +
                            "3. Sacar\n" +
                            "4. Consultar limite\n" +
                            "0. Sair\n\n" +
                            "Digite a opção desejada:");

            if (input == null) break;

            try {
                opcaoSubmenu = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                continue;
            }

            switch (opcaoSubmenu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + cc.getSaldo());
                    break;
                case 2:
                    double vDep = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito:"));
                    cc.depositar(vDep);
                    break;
                case 3:
                    double vSaq = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque:"));
                    cc.sacar(vSaq);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Limite disponível: R$ " + cc.getLimite());
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcaoSubmenu != 0);
    }

    private static void gerenciarContaPoupanca() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da Conta Poupança:"));
        String titular = JOptionPane.showInputDialog("Informe o nome do titular:");
        double taxa = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de rendimento (%):"));

        ContaPoupanca cp = new ContaPoupanca(numero, titular, taxa);
        int opcaoSubmenu = -1;

        do {
            String input = JOptionPane.showInputDialog(null,
                    "=== CONTA POUPANÇA ===\n" +
                            "Titular: " + cp.getTitular() + " | Nº: " + cp.getNumero() + "\n\n" +
                            "1. Consultar saldo\n" +
                            "2. Depositar\n" +
                            "3. Sacar\n" +
                            "4. Aplicar rendimento\n" +
                            "0. Sair\n\n" +
                            "Digite a opção desejada:");

            if (input == null) break;

            try {
                opcaoSubmenu = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                continue;
            }

            switch (opcaoSubmenu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + cp.getSaldo());
                    break;
                case 2:
                    double vDep = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito:"));
                    cp.depositar(vDep);
                    break;
                case 3:
                    double vSaq = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque:"));
                    cp.sacar(vSaq);
                    break;
                case 4:
                    cp.aplicarRendimento();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcaoSubmenu != 0);
    }
}