# 🏦 Sistema Bancário em Java

Aplicação de sistema bancário interativo desenvolvida em **Java** com interface gráfica legada via `JOptionPane`. O projeto aborda os conceitos fundamentais da Programação Orientada a Objetos (POO), como **Encapsulamento**, **Herança**, **Sobrescrita de Métodos** e **Sobrecarga de Construtores**.

---

## 📌 Funcionalidades

O sistema permite criar e gerenciar dois tipos de contas bancárias através de menus interativos:

### 💳 Conta Corrente
- **Consulta de Saldo**: Exibe o saldo disponível na conta.
- **Depósito**: Incrementa o saldo da conta.
- **Saque Diferenciado**: Permite saques considerando o **Saldo + Limite de Crédito** da conta.
- **Consulta de Limite**: Exibe o limite de crédito configurado.

### 💰 Conta Poupança
- **Consulta de Saldo**: Exibe o saldo disponível na conta.
- **Depósito**: Incrementa o saldo da conta.
- **Saque**: Permite saques apenas com base no saldo existente.
- **Aplicação de Rendimento**: Calcula e aplica automaticamente a porcentagem da taxa de rendimento sobre o saldo total disponível.

---

## 🛠️ Conceitos de POO Aplicados

- **Encapsulamento**: Atributos definidos como `private`, com acesso restrito via métodos *Getters* e modificadores protegidos para segurança das regras de negócio.
- **Herança**: A superclasse `ContaBancaria` centraliza atributos e métodos comuns (`numero`, `titular`, `saldo`, `depositar`), enquanto as subclasses `ContaCorrente` e `ContaPoupanca` especializam as funcionalidades.
- **Sobrescrita de Métodos (`@Override`)**: O método `sacar()` foi redefinido na classe `ContaCorrente` para incorporar o limite ao valor disponível de saque.
- **Sobrecarga de Construtores**: Presença de construtores padrão (vazios) e construtores parametrizados para flexibilidade na instanciação dos objetos.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- JDK (Java Development Kit) 8 ou superior instalado.
- Uma IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal configurado.

### Navegue até o diretório do projeto:

cd NOME_DO_REPOSITORIO

### Compile os arquivos Java:

javac -d bin src/org/example/*.java

### Execute a aplicação:

java -cp bin org.example.Main

## 🖥️ Tecnologias Utilizadas

- Linguagem: Java
- Interface Gráfica: Java Swing (javax.swing.JOptionPane)
