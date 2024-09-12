package fundamentos;

import java.util.Scanner;

public class ControleDeCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o saldo no início do mês: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Informe o total de todos os itens cobrados desse cliente no mês: ");
        double totalCobrados = scanner.nextDouble();

        System.out.print("Informe o total de créditos aplicados ao cliente no mês: ");
        double totalCreditos = scanner.nextDouble();

        System.out.print("Informe o limite de crédito autorizado: ");
        double limiteCredito = scanner.nextDouble();

        double saldoAtual = saldoInicial + totalCreditos - totalCobrados;

        if (saldoAtual > limiteCredito) {
            System.out.println("O cliente excedeu o limite de crédito.");
        } else {
            System.out.println("O cliente está dentro do limite de crédito.");
        }
    }
}