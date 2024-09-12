package fundamentos;

import java.util.Scanner;

public class QuadradoVazio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do lado do quadrado (entre 1 e 20): ");
        int tamanhoLado = scanner.nextInt();

        if (tamanhoLado < 1 || tamanhoLado > 20) {
            System.out.println("Tamanho de lado inválido. Por favor, informe um valor entre 1 e 20.");
            return;
        }

        // Imprime a borda superior do quadrado
        for (int i = 0; i < tamanhoLado; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Imprime as linhas internas do quadrado
        for (int i = 0; i < tamanhoLado - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < tamanhoLado - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Imprime a borda inferior do quadrado
        if (tamanhoLado > 1) {
            for (int i = 0; i < tamanhoLado; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}